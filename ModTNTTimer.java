import laithz.dev.gui.hud.ScreenPosition;
import laithz.dev.mods.ModDraggable;
import laithz.dev.mods.ModInstances;
import laithz.dev.util.font.FontUtil;

public class ModTntTimer extends ModDraggable {

	@Override
	public int getWidth() {
		return font.getStringWidth("[TNT Timer Enabled]");
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		if (ModInstances.getModTntTimer().isEnabled()) {
			FontUtil.normal.drawStringWithShadow("[TNT Timer Enabled]", pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
		}
	}
}
