package org.hedgewars.hedgeroid.netplay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hedgewars.hedgeroid.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PlayerListAdapter extends BaseAdapter {
	private List<Player> players = new ArrayList<Player>();
	private Context context;
	
	public PlayerListAdapter(Context context) {
		this.context = context;
	}
	
	public int getCount() {
		return players.size();
	}

	public Object getItem(int position) {
		return players.get(position);
	}

	public long getItemId(int position) {
		return players.get(position).playerId;
	}

	public boolean hasStableIds() {
		return true;
	}

	public void setPlayerList(Collection<Player> players) {
		this.players = new ArrayList<Player>(players);
		Collections.sort(this.players, Player.nameComparator);
		notifyDataSetChanged();
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = LayoutInflater.from(context);
			v = vi.inflate(android.R.layout.simple_list_item_1, null);
			TextView tv = (TextView)v.findViewById(android.R.id.text1);
			tv.setCompoundDrawablePadding(5);
			tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.human, 0, 0, 0);
		}

		String player = players.get(position).name;
		TextView username = (TextView) v.findViewById(android.R.id.text1);
		username.setText(player);
		return v;
	}
}