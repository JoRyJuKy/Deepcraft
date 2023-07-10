package net.mcreator.inzo.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.inzo.network.InzoModVariables;
import net.mcreator.inzo.InzoMod;

public class UseResonanceProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return "";
		double bellId = 0;
		bellId = new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.getLevel().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("deepcraft_bell_data", entity);
		if (bellId == 0) {
			return "";
		}
		if (10000 < System.currentTimeMillis() - (entity.getCapability(InzoModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new InzoModVariables.PlayerVariables())).bellLastUsed
				|| (entity.getCapability(InzoModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new InzoModVariables.PlayerVariables())).bellLastUsed == 0) {
			InzoMod.LOGGER.info("Bell ACTIVATED!!");
			{
				double _setval = System.currentTimeMillis();
				entity.getCapability(InzoModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bellLastUsed = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("inzo:bell")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("inzo:bell")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (bellId == 1) {
				if (entity instanceof Player _player) {
					_player.getAbilities().flying = true;
					_player.onUpdateAbilities();
				}
			}
		}
		return "";
	}
}
