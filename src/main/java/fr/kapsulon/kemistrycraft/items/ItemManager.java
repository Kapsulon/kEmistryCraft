package fr.kapsulon.kemistrycraft.items;

import org.bukkit.Material;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {
    public static ItemStack Hydrogen;
    public static ItemStack Helium;
    public static ItemStack Lithium;
    public static ItemStack Beryllium;
    public static ItemStack Boron;
    public static ItemStack Carbon;
    public static ItemStack Nitrogen;
    public static ItemStack Oxygen;
    public static ItemStack Fluorine;
    public static ItemStack Neon;
    public static ItemStack Sodium;
    public static ItemStack Magnesium;
    public static ItemStack Aluminium;
    public static ItemStack Silicon;
    public static ItemStack Phosphorus;
    public static ItemStack Sulfur;
    public static ItemStack Chlorine;
    public static ItemStack Argon;
    public static ItemStack Potassium;
    public static ItemStack Calcium;
    public static ItemStack Scandium;
    public static ItemStack Titanium;
    public static ItemStack Vanadium;
    public static ItemStack Chromium;
    public static ItemStack Manganese;
    public static ItemStack Iron;
    public static ItemStack Cobalt;
    public static ItemStack Nickel;
    public static ItemStack Copper;
    public static ItemStack Zinc;
    public static ItemStack Gallium;
    public static ItemStack Germanium;
    public static ItemStack Arsenic;
    public static ItemStack Selenium;
    public static ItemStack Bromine;
    public static ItemStack Krypton;
    public static ItemStack Rubidium;
    public static ItemStack Strontium;
    public static ItemStack Yttrium;
    public static ItemStack Zirconium;
    public static ItemStack Niobium;
    public static ItemStack Molybdenum;
    public static ItemStack Technetium;
    public static ItemStack Ruthenium;
    public static ItemStack Rhodium;
    public static ItemStack Palladium;
    public static ItemStack Silver;
    public static ItemStack Cadmium;
    public static ItemStack Indium;
    public static ItemStack Tin;
    public static ItemStack Antimony;
    public static ItemStack Tellurium;
    public static ItemStack Iodine;
    public static ItemStack Xenon;
    public static ItemStack Caesium;
    public static ItemStack Barium;
    public static ItemStack Lanthanum;
    public static ItemStack Hafnium;
    public static ItemStack Tantalum;
    public static ItemStack Tungsten;
    public static ItemStack Rhenium;
    public static ItemStack Osmium;
    public static ItemStack Iridium;
    public static ItemStack Platinum;
    public static ItemStack Gold;
    public static ItemStack Mercury;
    public static ItemStack Thallium;
    public static ItemStack Lead;
    public static ItemStack Bismuth;
    public static ItemStack Polonium;
    public static ItemStack Astatine;
    public static ItemStack Radon;
    public static ItemStack Francium;
    public static ItemStack Radium;
    public static ItemStack Actinium;
    public static ItemStack Rutherfordium;
    public static ItemStack Dubnium;
    public static ItemStack Seaborgium;
    public static ItemStack Bohrium;
    public static ItemStack Hassium;
    public static ItemStack Meitnerium;
    public static ItemStack Darmstadtium;
    public static ItemStack Roentgenium;
    public static ItemStack Copernicium;
    public static ItemStack Nihonium;
    public static ItemStack Flerovium;
    public static ItemStack Moscovium;
    public static ItemStack Livermorium;
    public static ItemStack Tennessine;
    public static ItemStack Oganesson;

    public enum CustomItem {
        HYDROGEN("Hydrogen", 100, Hydrogen),
        HELIUM("Helium", 101, Helium),
        LITHIUM("Lithium", 102, Lithium),
        BERYLLIUM("Beryllium", 103, Beryllium),
        BORON("Boron", 104, Boron),
        CARBON("Carbon", 105, Carbon),
        NITROGEN("Nitrogen", 106, Nitrogen),
        OXYGEN("Oxygen", 107, Oxygen),
        FLUORINE("Fluorine", 108, Fluorine),
        NEON("Neon", 109, Neon),
        SODIUM("Sodium", 110, Sodium),
        MAGNESIUM("Magnesium", 111, Magnesium),
        ALUMINIUM("Aluminium", 112, Aluminium),
        SILICON("Silicon", 113, Silicon),
        PHOSPHORUS("Phosphorus", 114, Phosphorus),
        SULFUR("Sulfur", 115, Sulfur),
        CHLORINE("Chlorine", 116, Chlorine),
        ARGON("Argon", 117, Argon),
        POTASSIUM("Potassium", 118, Potassium),
        CALCIUM("Calcium", 119, Calcium),
        SCANDIUM("Scandium", 120, Scandium),
        TITANIUM("Titanium", 121, Titanium),
        VANADIUM("Vanadium", 122, Vanadium),
        CHROMIUM("Chromium", 123, Chromium),
        MANGANESE("Manganese", 124, Manganese),
        IRON("Iron", 125, Iron),
        COBALT("Cobalt", 126, Cobalt),
        NICKEL("Nickel", 127, Nickel),
        COPPER("Copper", 128, Copper),
        ZINC("Zinc", 129, Zinc),
        GALLIUM("Gallium", 130, Gallium),
        GERMANIUM("Germanium", 131, Germanium),
        ARSENIC("Arsenic", 132, Arsenic),
        SELENIUM("Selenium", 133, Selenium),
        BROMINE("Bromine", 134, Bromine),
        KRYPTON("Krypton", 135, Krypton),
        RUBIDIUM("Rubidium", 136, Rubidium),
        STRONTIUM("Strontium", 137, Strontium),
        YTTRIUM("Yttrium", 138, Yttrium),
        ZIRCONIUM("Zirconium", 139, Zirconium),
        NIOBIUM("Niobium", 140, Niobium),
        MOLYBDENUM("Molybdenum", 141, Molybdenum),
        TECHNETIUM("Technetium", 142, Technetium),
        RUTHENIUM("Ruthenium", 143, Ruthenium),
        RHODIUM("Rhodium", 144, Rhodium),
        PALLADIUM("Palladium", 145, Palladium),
        SILVER("Silver", 146, Silver),
        CADMIUM("Cadmium", 147, Cadmium),
        INDIUM("Indium", 148, Indium),
        TIN("Tin", 149, Tin),
        ANTIMONY("Antimony", 150, Antimony),
        TELLURIUM("Tellurium", 151, Tellurium),
        IODINE("Iodine", 152, Iodine),
        XENON("Xenon", 153, Xenon),
        CAESIUM("Caesium", 154, Caesium),
        BARIUM("Barium", 155, Barium),
        LANTHANUM("Lanthanum", 156, Lanthanum),
        HAFNIUM("Hafnium", 157, Hafnium),
        TANTALUM("Tantalum", 158, Tantalum),
        TUNGSTEN("Tungsten", 159, Tungsten),
        RHENIUM("Rhenium", 160, Rhenium),
        OSMIUM("Osmium", 161, Osmium),
        IRIDIUM("Iridium", 162, Iridium),
        PLATINUM("Platinum", 163, Platinum),
        GOLD("Gold", 164, Gold),
        MERCURY("Mercury", 165, Mercury),
        THALLIUM("Thallium", 166, Thallium),
        LEAD("Lead", 167, Lead),
        BISMUTH("Bismuth", 168, Bismuth),
        POLONIUM("Polonium", 169, Polonium),
        ASTATINE("Astatine", 170, Astatine),
        RADON("Radon", 171, Radon),
        FRANCIUM("Francium", 172, Francium),
        RADIUM("Radium", 173, Radium),
        ACTINIUM("Actinium", 174, Actinium),
        RUTHERFORDIUM("Rutherfordium", 175, Rutherfordium),
        DUBNIUM("Dubnium", 176, Dubnium),
        SEABORGIUM("Seaborgium", 177, Seaborgium),
        BOHRIUM("Bohrium", 178, Bohrium),
        HASSIUM("Hassium", 179, Hassium),
        MEITNERIUM("Meitnerium", 180, Meitnerium),
        DARMSTADTIUM("Darmstadtium", 181, Darmstadtium),
        ROENTGENIUM("Roentgenium", 182, Roentgenium),
        COPERNICIUM("Copernicium", 183, Copernicium),
        NIHONIUM("Nihonium", 184, Nihonium),
        FLEROVIUM("Flerovium", 185, Flerovium),
        MOSCOVIUM("Moscovium", 186, Moscovium),
        LIVERMORIUM("Livermorium", 187, Livermorium),
        TENNESSINE("Tennessine", 188, Tennessine),
        OGANESSON("Oganesson", 189, Oganesson);
        public final String code;
        public final int element;
        public ItemStack item;

        CustomItem(String code, int element, ItemStack item) {
            this.code = code;
            this.element = element;
            this.item = item;
        }

        public static ItemStack getCustomItemByCode(String code) {
            for (CustomItem customItem : CustomItem.values()) {
                if (customItem.code.equals(code)) {
                    return customItem.item;
                }
            }
            return null;
        }
    }

    public static void init() {
        for (CustomItem customItem : CustomItem.values()) {
            customItem.item = createElement(customItem.element, customItem.code);
        }
    }

    private static ItemStack createElement(int material, String name) {
        ItemStack item = new ItemStack(Material.COMMAND_BLOCK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(material);
        meta.setDisplayName("§b" + name + String.valueOf(material-100));
        /*List<String> lore = new ArrayList<String>();
        lore.add("§8Right Click with §7§uthis§r §8item to gain a life.");
        meta.setLore(lore);*/
        item.setItemMeta(meta);
        return item;
    }
}
