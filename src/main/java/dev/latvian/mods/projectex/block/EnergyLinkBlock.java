package dev.latvian.mods.projectex.block;

import dev.latvian.mods.projectex.block.entity.EnergyLinkBlockEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class EnergyLinkBlock extends Block {
	public EnergyLinkBlock() {
		super(Properties.of(Material.STONE).strength(5F).sound(SoundType.STONE));
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public BlockEntity createTileEntity(BlockState state, BlockGetter world) {
		return new EnergyLinkBlockEntity();
	}
}