/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sketch.Logic.util;

import java.awt.event.ActionListener;
import sketch.Logic.variables.CalendarView;
import sketch.Logic.variables.CheckBox;
import sketch.Logic.variables.EditText;
import sketch.Logic.variables.ImageView;
import sketch.Logic.variables.ListView;
import sketch.Logic.variables.SeekBar;
import sketch.Logic.variables.Spinner;
import sketch.Logic.variables.Switch;
import sketch.Logic.variables.TextView;
import sketch.Logic.variables.WebView;

public interface EventListenerExtended extends ActionListener {

    //Basic
    public void onStart();

    public void onStop();

    public void onPostCreate();

    //TextView
    public void onClick(TextView t);

    //EditText
    public void onClick(EditText e);

    public void onTextChanged(EditText e);

    //ImageView
    public void onClick(ImageView i);

    //CheckBox
    public void onClick(CheckBox c);

    public void onCheckChanged(CheckBox c);

    //Spinner
    public void onItemSelected(Spinner s);

    //ListView
    public void onItemClicked(ListView l);

    public void onItemLongClicked(ListView l);

    //WebView
    public void onPageStarted(WebView w);

    public void onPageFinished(WebView w);

    //Switch
    public void onClick(Switch s);

    public void onCheckChanged(Switch s);

    //SeekBar
    public void onProgressChanged(SeekBar s);

    public void onStartTrackingTouch(SeekBar s);

    public void onStopTrackingTouch(SeekBar s);

    //CalendarView
    public void onDateChange(CalendarView c);
}
