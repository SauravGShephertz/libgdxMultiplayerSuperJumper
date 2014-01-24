package appwarp;

public interface WarpListener {
	
	public void onWaitingStarted(String message);
	
	public void onError(String message);
	
	public void onGameStarted(String message);
	
	public void onGameFinished(int code, boolean isRemote);
	
	public void onGameUpdateReceived(String message);
	
}
