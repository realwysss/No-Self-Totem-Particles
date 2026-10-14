/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2394
 *  net.minecraft.class_2398
 *  net.minecraft.class_310
 *  net.minecraft.class_702
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.example.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_310;
import net.minecraft.class_702;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_702.class})
public class PMix {
    @Inject(method={"method_3051(Lnet/minecraft/class_1297;Lnet/minecraft/class_2394;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void onAdd(class_1297 e, class_2394 p, int a, CallbackInfo c) {
        if (p == class_2398.field_11220) {
            class_310 mc = class_310.method_1551();
            if (mc.field_1724 != null && e.method_5628() == mc.field_1724.method_5628()) {
                c.cancel();
            }
        }
    }
}

