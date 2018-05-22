package com.example.kishan.getaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;

//
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //After Selecting the user address:
        PlaceAutocompleteFragment places= (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);
        places.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {

                Intent myAddress = new Intent(MainActivity.this,GetAddressActivity.class);
                myAddress.putExtra("Address",place.getAddress());
                startActivity(myAddress);
            }

            @Override
            public void onError(Status status) {

                Toast.makeText(getApplicationContext(),status.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
