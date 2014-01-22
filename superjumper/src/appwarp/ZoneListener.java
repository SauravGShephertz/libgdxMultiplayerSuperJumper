package appwarp;

import com.shephertz.app42.gaming.multiplayer.client.command.WarpResponseResultCode;
import com.shephertz.app42.gaming.multiplayer.client.events.AllRoomsEvent;
import com.shephertz.app42.gaming.multiplayer.client.events.AllUsersEvent;
import com.shephertz.app42.gaming.multiplayer.client.events.LiveRoomInfoEvent;
import com.shephertz.app42.gaming.multiplayer.client.events.LiveUserInfoEvent;
import com.shephertz.app42.gaming.multiplayer.client.events.MatchedRoomsEvent;
import com.shephertz.app42.gaming.multiplayer.client.events.RoomEvent;
import com.shephertz.app42.gaming.multiplayer.client.listener.RoomRequestListener;
import com.shephertz.app42.gaming.multiplayer.client.listener.ZoneRequestListener;

public class ZoneListener implements ZoneRequestListener{

	
	private WarpController callBack;
	
	public ZoneListener(WarpController callBack) {
		this.callBack = callBack;
	}

	@Override
	public void onCreateRoomDone (RoomEvent re) {
		if(re.getResult()==WarpResponseResultCode.SUCCESS){
			callBack.onRoomCreated(re.getData().getId());
		}else{
			callBack.onRoomCreated(null);
		}
		
	}

	@Override
	public void onDeleteRoomDone (RoomEvent arg0) {
		
		
	}

	@Override
	public void onGetAllRoomsDone (AllRoomsEvent arg0) {
		
		
	}

	@Override
	public void onGetLiveUserInfoDone (LiveUserInfoEvent arg0) {
		
		
	}

	@Override
	public void onGetMatchedRoomsDone (MatchedRoomsEvent me) {
		
	}

	@Override
	public void onGetOnlineUsersDone (AllUsersEvent arg0) {
		
		
	}

	@Override
	public void onSetCustomUserDataDone (LiveUserInfoEvent arg0) {
		
		
	}
	

}
