package com.brand.blockus.blocks;

import com.brand.blockus.Blockus;
import com.brand.blockus.blocks.entity.WoodenBarrelsEntity;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class WoodenBarrels extends BarrelBlock {

	public WoodenBarrels(String name, float hardness, float resistance) {
		super(FabricBlockSettings.of(Material.WOOD).strength(hardness, resistance).build());
		Registry.register(Registry.BLOCK, new Identifier(Blockus.MOD_ID, name), this);
		Registry.register(Registry.ITEM,new Identifier(Blockus.MOD_ID, name), new BlockItem(this, new Item.Settings().stackSize(64).itemGroup(Blockus.BLOCKUS_DECORATIONS)));
    }
	
	@Override
	public BlockEntity createBlockEntity(BlockView blockView_1) {
		return new WoodenBarrelsEntity();
	}
}