private static ModTNTTimer modTNTTimer;

public static void register(HUDManager api) {
  
  modTntTimer = new ModTntTimer();
		api.register(modTntTimer);
  
  public static ModTNTTimer getModTNTTimer() {
		return modTNTTimer;
	}
