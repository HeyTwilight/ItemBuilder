package whyze.timeonline.util;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
public class SkullBuilder extends ItemBuilder {

    private SkullMeta skullMeta;

    public SkullBuilder() {
        super(1, 1, 1);
        skullMeta = (SkullMeta) itemMeta;
    }

    @Deprecated
    public SkullBuilder setOwner(String owner){
        skullMeta = (SkullMeta) itemMeta;
        skullMeta.setOwner(owner);
        return this;
    }

    @Override
    public ItemStack build() {
        return itemStack;
    }
}