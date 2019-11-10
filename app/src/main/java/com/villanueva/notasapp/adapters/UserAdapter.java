package com.villanueva.notasapp.adapters;

import android.support.v4.app.*;
import android.support.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import com.villanueva.notasapp.R;
import com.villanueva.notasapp.models.Usuario;
public class UserAdapter {
    private List<Usuario> users;

    public void setUsers(List<Usuario> users) {
        this.users = users;
    }

    public UserAdapter() {
        users = new ArrayList<>();
    }

}
