package com.exemple.gsb_android;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by romain.bezard on 26/03/2018.
 */

public class DatePickerRapport extends DialogFragment implements DatePickerDialog.OnDateSetListener{
        @Override
        public Dialog onCreateDialog(Bundle bundle){
            final Calendar c = Calendar.getInstance();
            int annee = c.get(Calendar.YEAR);
            int mois = c.get(Calendar.MONTH);
            int jour = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dpd = new DatePickerDialog(getActivity(), this, annee, mois, jour);
            dpd.getDatePicker().setSpinnersShown(false);
            dpd.getDatePicker().setCalendarViewShown(true);
            return dpd;
        }

        @Override
        public void onDateSet(android.widget.DatePicker view, int annee, int mois, int jour){
            mois++;
            String month = monthIntToString(mois);
            TextView dateVisite = getActivity().findViewById(R.id.Txt_DateVisite);
            dateVisite.setText(jour + " " + month + " " + annee);
        }

        public String monthIntToString(int mois){
            String month = "";
            if(mois == 1){month = "Janvier";}
            else if(mois == 2){month = "Fevrier";}
            else if(mois == 3){month = "Mars";}
            else if(mois == 4){month = "Avril";}
            else if(mois == 5){month = "Mai";}
            else if(mois == 6){month = "Juin";}
            else if(mois == 7){month = "Juillet";}
            else if(mois == 8){month = "Août";}
            else if(mois == 9){month = "Septembre";}
            else if(mois == 10){month = "Octobre";}
            else if(mois == 11){month = "Novembre";}
            else if(mois == 12){month = "Decembre";}
            return month;
        }
}
