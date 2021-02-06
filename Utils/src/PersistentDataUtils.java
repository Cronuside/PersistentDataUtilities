package dev.cronuside.blockstation.utils.menu;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

/*
 * Copyright (c) 2021. Cronuside
 */

public class PersistentDataUtils {

    public boolean itemDataContainsKey(NamespacedKey key, ItemStack item){
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer itemData = meta.getPersistentDataContainer();
        return itemData.getKeys().contains(key);
    }

    public boolean playerDataContainsKey(NamespacedKey key, Player player){
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        return playerData.getKeys().contains(key);
    }

    public void setPlayerDataInteger(NamespacedKey key, Player player, int value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        playerData.set(key, PersistentDataType.INTEGER, value);
    }

    public void setPlayerDataDouble(NamespacedKey key, Player player, double value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        playerData.set(key, PersistentDataType.DOUBLE, value);
    }

    public void setPlayerDataString(NamespacedKey key, Player player, String value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        playerData.set(key, PersistentDataType.STRING, value);
    }

    public void setPlayerDataLong(NamespacedKey key, Player player, long value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        playerData.set(key, PersistentDataType.LONG, value);
    }

    public void setPlayerDataFloat(NamespacedKey key, Player player, float value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        playerData.set(key, PersistentDataType.FLOAT, value);
    }

    public int getPlayerDataInteger(NamespacedKey key, Player player) {
        int value = 0;
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (playerData.has(key, PersistentDataType.INTEGER))
            value = playerData.get(key, PersistentDataType.INTEGER);
        return value;
    }

    public double getPlayerDataDouble(NamespacedKey key, Player player) {
        double value = 0D;
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (playerData.has(key, PersistentDataType.DOUBLE))
            value = playerData.get(key, PersistentDataType.DOUBLE);
        return value;
    }

    public String getPlayerDataString(NamespacedKey key, Player player) {
        String value = null;
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (playerData.has(key, PersistentDataType.STRING))
            value = playerData.get(key, PersistentDataType.STRING);
        return value;
    }

    public float getPlayerDataFloat(NamespacedKey key, Player player) {
        float value = 0f;
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (playerData.has(key, PersistentDataType.FLOAT))
            value = playerData.get(key, PersistentDataType.FLOAT);
        return value;
    }

    public long getPlayerDataLong(NamespacedKey key, Player player) {
        long value = 0L;
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (playerData.has(key, PersistentDataType.LONG))
            value = playerData.get(key, PersistentDataType.LONG);
        return value;
    }

    public void addPlayerDataInteger(NamespacedKey key, Player player, int value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (!playerData.has(key, PersistentDataType.INTEGER)){
            setPlayerDataInteger(key, player, 0);
        }
        int finalValue = playerData.get(key, PersistentDataType.INTEGER) + value;
        setPlayerDataInteger(key, player, finalValue);
    }

    public void addPlayerDataDouble(NamespacedKey key, Player player, double value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (!playerData.has(key, PersistentDataType.DOUBLE)){
            setPlayerDataDouble(key, player, 0D);
        }
        double finalValue = playerData.get(key, PersistentDataType.DOUBLE) + value;
        setPlayerDataDouble(key, player, finalValue);
    }

    public void addPlayerDataLong(NamespacedKey key, Player player, long value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (!playerData.has(key, PersistentDataType.LONG)){
            setPlayerDataLong(key, player, 0L);
        }
        long finalValue = playerData.get(key, PersistentDataType.LONG) + value;
        setPlayerDataLong(key, player, finalValue);
    }

    public void addPlayerDataFloat(NamespacedKey key, Player player, float value) {
        PersistentDataContainer playerData = player.getPersistentDataContainer();
        if (!playerData.has(key, PersistentDataType.FLOAT)){
            setPlayerDataFloat(key, player, 0F);
        }
        float finalValue = playerData.get(key, PersistentDataType.FLOAT) + value;
        setPlayerDataFloat(key, player, finalValue);
    }

    public void setItemDataInteger(NamespacedKey key, ItemStack item, int value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        ItemData.set(key, PersistentDataType.INTEGER, value);
        item.setItemMeta(meta);
    }

    public void setItemDataDouble(NamespacedKey key, ItemStack item, double value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        ItemData.set(key, PersistentDataType.DOUBLE, value);
        item.setItemMeta(meta);
    }

    public void setItemDataString(NamespacedKey key, ItemStack item, String value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        ItemData.set(key, PersistentDataType.STRING, value);
        item.setItemMeta(meta);
    }

    public void setItemDataLong(NamespacedKey key, ItemStack item, long value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        ItemData.set(key, PersistentDataType.LONG, value);
        item.setItemMeta(meta);
    }

    public void setItemDataFloat(NamespacedKey key, ItemStack item, float value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        ItemData.set(key, PersistentDataType.FLOAT, value);
        item.setItemMeta(meta);
    }

    public int getItemDataInteger(NamespacedKey key, ItemStack item) {
        int value = 0;
        if (!item.hasItemMeta()) return 0;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (ItemData.has(key, PersistentDataType.INTEGER))
            value = ItemData.get(key, PersistentDataType.INTEGER);
        return value;
    }

    public double getItemDataDouble(NamespacedKey key, ItemStack item) {
        double value = 0D;
        if (!item.hasItemMeta()) return 0D;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (ItemData.has(key, PersistentDataType.DOUBLE))
            value = ItemData.get(key, PersistentDataType.DOUBLE);
        return value;
    }

    public String getItemDataString(NamespacedKey key, ItemStack item) {
        String value = null;
        if (!item.hasItemMeta()) return null;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (ItemData.has(key, PersistentDataType.STRING))
            value = ItemData.get(key, PersistentDataType.STRING);
        return value;
    }

    public float getItemDataFloat(NamespacedKey key, ItemStack item) {
        float value = 0f;
        if (!item.hasItemMeta()) return 0f;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (ItemData.has(key, PersistentDataType.FLOAT))
            value = ItemData.get(key, PersistentDataType.FLOAT);
        return value;
    }

    public long getItemDataLong(NamespacedKey key, ItemStack item) {
        long value = 0L;
        if (!item.hasItemMeta()) return 0L;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (ItemData.has(key, PersistentDataType.LONG))
            value = ItemData.get(key, PersistentDataType.LONG);
        return value;
    }

    public void addItemDataInteger(NamespacedKey key, ItemStack item, int value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (!ItemData.has(key, PersistentDataType.INTEGER)) return;
        int finalValue = ItemData.get(key, PersistentDataType.INTEGER) + value;
        setItemDataInteger(key, item, finalValue);
        item.setItemMeta(meta);
    }

    public void addItemDataDouble(NamespacedKey key, ItemStack item, double value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (!ItemData.has(key, PersistentDataType.DOUBLE)) return;
        double finalValue = ItemData.get(key, PersistentDataType.DOUBLE) + value;
        setItemDataDouble(key, item, finalValue);
        item.setItemMeta(meta);
    }

    public void addItemDataLong(NamespacedKey key, ItemStack item, long value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (!ItemData.has(key, PersistentDataType.LONG)) return;
        long finalValue = ItemData.get(key, PersistentDataType.LONG) + value;
        setItemDataLong(key, item, finalValue);
        item.setItemMeta(meta);
    }

    public void addItemDataFloat(NamespacedKey key, ItemStack item, float value) {
        if (!item.hasItemMeta()) return;
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer ItemData = meta.getPersistentDataContainer();
        if (!ItemData.has(key, PersistentDataType.FLOAT)) return;
        float finalValue = ItemData.get(key, PersistentDataType.FLOAT) + value;
        setItemDataFloat(key, item, finalValue);
        item.setItemMeta(meta);
    }


}
