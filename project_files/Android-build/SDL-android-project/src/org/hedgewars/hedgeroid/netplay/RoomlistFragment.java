package org.hedgewars.hedgeroid.netplay;

import org.hedgewars.hedgeroid.R;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RoomlistFragment extends ListFragment {
	//List<Player> roomList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*playerList = new ArrayList<Player>();
		PlayerListAdapter playerListAdapter = new PlayerListAdapter(getActivity());
		playerListAdapter.setPlayerList(playerList);
		setListAdapter(playerListAdapter);*/
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.lobby_rooms_fragment, container, false);
	}
}
