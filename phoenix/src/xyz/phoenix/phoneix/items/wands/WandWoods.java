package xyz.phoenix.phoneix.items.wands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class WandWoods {

    public short spruceDarkOak = 1;
    public short acaciaOak = 0;

    public short birch = 2;
    public short jungle = 3;



public ItemStack acacia() {

    ItemStack wandWood = new ItemStack(Material.LOG_2, 1, acaciaOak);

    ItemMeta wwandWood = wandWood.getItemMeta();

    wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Acacia Wood");
    ArrayList<String> wandWoodLore = new ArrayList<>();
    wandWoodLore.add(ChatColor.WHITE + "Wood chunk from Acacia tree.");
    wwandWood.setLore(wandWoodLore);
    wwandWood.addEnchant(Enchantment.LUCK, 1, true);
    wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
    wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    wandWood.setItemMeta(wwandWood);
    return wandWood;
}

    public ItemStack alder() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Alder Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from Alder tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack apple() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Apple Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Applewood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack ash() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Ash Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Ash tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack aspen() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Aspen Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Aspen tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }

    public ItemStack beech() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Beech Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Beech tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack blackthorn() {

        ItemStack wandWood = new ItemStack(Material.LOG_2, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Blackthorn Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Blackthorn tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack blackWalnut() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Black Walnut Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Black Walnut tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }

    public ItemStack cedar() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Cedar Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Cedar tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }

    public ItemStack cherry() {

        ItemStack wandWood = new ItemStack(Material.LOG_2, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Cherry Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Cherrywood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack chestnut() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Chestnut Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Chestnut tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack cypress() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Cypress Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Cypress tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack dogwood() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Dogwood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Dogwood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack ebony() {

        ItemStack wandWood = new ItemStack(Material.LOG_2, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Ebony Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Ebony tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack elder() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, jungle);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Elder Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Elderwood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack elm() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Elm Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an Elm tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack englishOak() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "English Oak Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from an English Oak tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack fir() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Fir Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Fir tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack hawthorn() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Hawthorn Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Hawthorn tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack hazel() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Hazel Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Hazel tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack holly() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Holly Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Holly tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack hornbeam() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Hornbeam Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Hornbeam tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack larch() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Larch Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Larch tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack laurel() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Laurel Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Laurel tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack maple() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, birch);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Maple Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Maple tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack pear() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Pear Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Pearwood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack pine() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Pine Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Pine tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack poplar() {

        ItemStack wandWood = new ItemStack(Material.LOG_2, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Poplar Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Poplar tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack redOak() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Red Oak Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Red Oak tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack redwood() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Redwood Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Redwood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack rowan() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Rowan Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Rowan tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack silverLime() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Silver Lime Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Silver Lime Wood tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack spruce() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Spruce Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Spruce tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack sycamore() {

        ItemStack wandWood = new ItemStack(Material.LOG_2, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Sycamore Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Sycamore tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack vine() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Vine Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Vine tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack walnut() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Walnut Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Walnut tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack willow() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, spruceDarkOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Willow Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Willow tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }
    public ItemStack yew() {

        ItemStack wandWood = new ItemStack(Material.LOG, 1, acaciaOak);
        ItemMeta wwandWood = wandWood.getItemMeta();
        wwandWood.setDisplayName(ChatColor.DARK_PURPLE + "Yew Wood");
        ArrayList<String> wandWoodLore = new ArrayList<>();
        wandWoodLore.add(ChatColor.WHITE + "Wood chunk from a Yew tree.");
        wwandWood.setLore(wandWoodLore);
        wwandWood.addEnchant(Enchantment.LUCK, 1, true);
        wwandWood.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        wwandWood.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        wandWood.setItemMeta(wwandWood);
        return wandWood;
    }


}
