package net.fabricmc.example.mixin;

import mindustry.desktop.DesktopLauncher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DesktopLauncher.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "main")
	private static void init(CallbackInfo info) {
		System.out.println("This line is printed by an example mod mixin!");
	}
}
