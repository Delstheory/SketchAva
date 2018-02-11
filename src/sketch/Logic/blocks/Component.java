package sketch.Logic.blocks;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sketch.Logic.util.SketchException;
import sketch.Logic.variables.Activity;
import sketch.Logic.variables.Calendar;
import sketch.Logic.variables.Dialog;
import sketch.Logic.variables.File;
import sketch.Logic.variables.Intent;
import sketch.Logic.variables.MediaPlayer;
import sketch.Logic.variables.SketchComponent;
import sketch.Logic.variables.Timer;
import sketch.Logic.variables.Vibrator;

/**
 * This class contains methods of part Component (see tab Logic in Sketchware),
 * which allow you to work with variables of types: <div><code>Activity, Intent, File,
 * Calendar, Vibrator, Timer, Dialog, MediaPlayer, SoundPool, ObjectAnimator</code>(NOT
 * SUPPORTED YET)</div>
 *
 * @author Vladg24
 */
public class Component {

    //BASIC\\
    /**
     * Display the text in a popup
     *
     * @param parentComponent SketchComponent
     * @param text String
     */
    public static void Toast(SketchComponent parentComponent, String text) {
        JOptionPane.showMessageDialog(parentComponent, text, "TOAST", 0);
    }

    /**
     * Set the title for the current Activity
     *
     * @param title - String
     */
    public static void ActivitySetTitle(Activity a, String title) {
        a.setTitle(title);
    }

    /**
     * Launch a new Activity by Intent
     * <h3>*A SketchException RunTimeException may be caught if the parameter
     * equals null</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Intent</code> to use
     * this</h3>
     *
     * @param i Intent
     */
    public static void StartActivity(Activity a) {
        a.start();
    }

    /**
     * Get the data from Intent
     * <h3>*Only the value saved by Component.PutExtraKey block can be
     * retrieved</h3>
     * <h3>*Get the NullPointerException if parameter is null</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Intent</code> to use
     * this</h3>
     *
     * @param key String
     * @return String - value of the key <code>key</code>
     */
    public static String ActivityGetExtraKey(Activity a, String key) {
        return a.keyGetVal(key);
    }

    /**
     * Finish the current Activity
     */
    public static void finishActivity(Activity a) {
        a.finish();
    }

    //INTENT\\
    /**
     * Set the Intent action to be performed
     * <p>
     * Intent: a component for load an Activity(view)
     * <div>-ACTION_CALL: Perform a cal to someone specified by the data(NOT
     * SUPPORTED YET, will be transformed into email sending)</div>
     * <div>-ACTION_DIAL: Dial a number as specified by the data</div>
     * <div>-ACTION_VIEW: Display the data to the user</div>
     * <h3>*You need to add <code>sketch.Logic.variables.Intent</code> to use
     * this</h3>
     *
     * @param i Intent
     * @param action String (ACTION_CALL, ACTION_DIAL or ACTION_VIEW)
     */
    public static void IntentSetAction(Intent i, String action) {
        final String ACTION_DIAL = "ACTION_DIAL";
        final String ACTION_CALL = "ACTION_CALL";
        final String ACTION_VIEW = "ACTION_VIEW";

        if (action == ACTION_DIAL) {
            i.action = ACTION_DIAL;
        } else if (action == ACTION_CALL) {
            SketchException.ThrowNewException.UnsupportedValueException("The value " + action + " is unsupported yet", "sketch.Logic.blocks.Component(" + i + ", " + action + ");", 19);
        } else if (action == ACTION_VIEW) {
            i.action = ACTION_VIEW;
        } else {
            SketchException.ThrowNewException.UnknownValueException("The value " + action + " is incorrect", "sketch.Logic.blocks.Component.IntentSetAction(" + i + ", " + action + ");", 32);
        }
    }

    /**
     * Set the data this Intent is operating on
     * <div>-ACTION_CALL: must start with tel(email in future)</div>
     * <div>-ACTION_DIAL: must start with tel(email in future)</div>
     * <div>-ACTION_VIEW: must follow URL form starting with <url>http:</url> or
     * <url>https:</url></div>
     *
     * @param i Intent
     * @param data String
     */
    public static void IntentSetData(Intent i, String data) {
        i.data = data;
    }

    /**
     * Set the Activity(View) to be performed
     * <h3>*You need to add <code>sketch.Logic.variables.Intent</code> to use
     * this</h3>
     *
     * @param i Intent
     * @param act Activity
     */
    public static void IntentSetScreen(Intent i, Activity act) {
        i.screen = act;
    }

    /**
     * Bind the data to Intent
     * <h3>*Send to Activity with key : value format</h3>
     * <h3>*Intent can have multiple keys and values</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Intent</code> to use
     * this</h3>
     *
     * @param i Intent
     * @param key String
     * @param value value
     */
    public static void IntentPutExtraKeyValue(Intent i, String key, String value) {
        i.keySetVal(key, value);
    }

    /**
     * Set special conditions controlling how this intent is handled
     * <div>-SINGLE_TOP: Views are usually maintained licke a deck of cards,
     * stacked on top of each other. This block makes the application manage
     * views in a way that if the view you~re about to transition to was already
     * called before, it would bring that view to the front rather than putting
     * a new view on top.</div>
     * <div>-CLEAR_TOP: Clears all the previous views under the current
     * view.</div>
     * <h3>*You need to add <code>sketch.Logic.variables.Intent</code> to use
     * this</h3>
     *
     * @param i Intent
     * @param flag String (SINGLE_TOP or CLEAR_TOP)
     */
    public static void IntentSetFlags(Intent i, String flag) {
        final String SINGLE_TOP = "SINGLE_TOP";
        final String CLEAR_TOP = "CLEAR_TOP";

        if (flag.equals(SINGLE_TOP)) {
            Intent.flag = SINGLE_TOP;
        } else if (flag.equals(CLEAR_TOP)) {
            Intent.flag = CLEAR_TOP;
        } else {
            SketchException.ThrowNewException.UnknownValueException("The value " + flag + " is incorrect", "sketch.Logic.blocks.Component.IntentSetFlags(" + flag + ");", 57);
        }
    }

    //FILE\\
    /**
     * Retrieve a value from the preference file
     * <div>The value saved by <code>Component.FileSetDataKey</code> can be
     * retrieved</div>
     * <h3>*You need to add <code>sketch.Logic.variables.File</code> to use
     * this</h3>
     *
     * @param f File
     * @param key String
     * @return String <code>keyValue</code>
     */
    public static String FileGetDataKey(File f, String key) {
        return f.keyGetVal(key);
    }

    /**
     * Set a value in the preference file
     * <h3>*Application can have multiplie files and a file can have multiple
     * values</h3>
     * <h3>*The keys in the file must be unique. If the same key is used several
     * times, only the latest saved value is accessible</h3>
     * <h3>*Format - key:value</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.File</code> to use
     * this</h3>
     *
     * @param f File
     * @param key String
     * @param value String
     */
    public static void FileSetDataKey(File f, String key, String value) {
        f.keySetVal(key, value);
    }

    /**
     * Remove file data with the following key
     *
     * @param f File
     * @param key String
     */
    public static void FileRemoveDataKey(File f, String key) {
        f.deleteKey(key);
    }

    //CALENDAR\\
    /**
     * Get the current date and time
     * <h3>*You need to add <code>sketch.Logic.variables.Calendar</code> to use
     * this</h3>
     *
     * @param c Calendar
     * @param format String
     * @return <code>String</code> date
     */
    public static String CalendarGetNow(Calendar c, String format) {
        return c.getNowDate(format);
    }

    /**
     * Set the Calendar field to a specific value
     *
     * @param c Calendar
     * @param typeOfDate String <code>YEAR, MONTH, DAY_OF_MONTH, HOUR24, HOUR12,
     * MINUTE, SECOND</code>
     * @param value int
     */
    public static void CalendarSetValue(Calendar c, String typeOfDate, int value) {
        if (typeOfDate.equals("YEAR") || typeOfDate.equals("MONTH") || typeOfDate.equals("DAY_OF_MONTH") || typeOfDate.equals("HOUR24") || typeOfDate.equals("HOUR12") || typeOfDate.equals("MINUTE") || typeOfDate.equals("SECOND")) {
            c.set(typeOfDate, value);
        } else {
            SketchException.ThrowNewException.UnknownValueException("The value " + typeOfDate + " is incorrect", "sketch.Logic.blocks.Component.CalendarSet(" + c.toString() + ", " + typeOfDate + ", " + value + ");", 98);
        }
    }

    /**
     * Add the given amount of time to the Calendar field
     * <h3>*Positive value: adds time</h3>
     * <h3>*Negative value: subtracts time</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Calendar</code> to use
     * this</h3>
     *
     * @param c
     * @param typeOfDate
     * @param value
     */
    public static void CalendarAddValue(Calendar c, String typeOfDate, int value) {
        if (typeOfDate.equals("YEAR") || typeOfDate.equals("MONTH") || typeOfDate.equals("DAY_OF_MONTH") || typeOfDate.equals("HOUR") || typeOfDate.equals("MINUTE") || typeOfDate.equals("SECOND")) {
            c.add(typeOfDate, value);
        } else {
            SketchException.ThrowNewException.UnknownValueException("The value " + typeOfDate + " is incorrect", "sketch.Logic.blocks.Component.CalendarSet(" + c.toString() + ", " + typeOfDate + ", " + value + ");", 106);
        }
    }

    /**
     * Format the Calendar as a <code>String</code> using the pattern<br>
     * Year(y)|Month(M)|Day(d)<br>
     * Hour(h)1~12|Hour(H)0~23|Minute(m)|Second(s)
     * <h2>So the parameter <code>formet</code> can be equal to:<br>
     * - <code>yyyy-MM-dd:HH-mm-ss</code><br>
     * - <code>yyyy-MM-dd:hh-mm-ss</code>
     * <h3>*A NullPointerException may be caught if the given string format is
     * invalid</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Calendar</code> to use
     * this</h3>
     *
     * @param c Calendar
     * @param format String: <div>"yyyy-MM-dd:hh-mm-ss" = 0~12
     * hours</div><div>"yyyy-MM-ss:HH-mm-ss" = 0~24 hours</div>
     * @return <code>String</code> date
     */
    public static String CalendarFormat(Calendar c, String format) {
        if (format.equals("yyyy-MM-dd:HH-mm-ss")) {
            return c.getNowDate("YYYY-MM-DD") + c.getNowTime("HH:mm:ss");
        } else if (format.equals("yyyy-MM-dd:hh-mm-ss")) {
            return c.getNowDate("YYYY-MM-DD") + c.getNowTime("hh:mm:ss");
        } else {
            throw new NullPointerException("The parameter [format] is invalid");
        }
    }

    /**
     * Get the difference between the given calendars (time)
     * <br>
     * Unit: milliseconds
     * <h3>You need to add <code>sketch.Logic.variables.Calendar</code> to use
     * this</h3>
     *
     * @param c1 Calendar 1
     * @param c2 Calendar 2
     * @return <code>int</code> ms
     */
    public static int CalendarDifference(Calendar c1, Calendar c2) {
        return c1.getNowMS() - c2.getNowMS();
    }

    /**
     * Returns this Calendar`s time value in milleseconds since January 1, 1970
     * 00:00:00
     *
     * @param c Calnedar
     * @return <code>int</code> time
     */
    public static int CalendarGetTimeMS(Calendar c) {
        return c.getNowMS();
    }

    /**
     * Sets this Calendar`s current time from the given value since January 1,
     * 1970 00:00:00
     *
     * @param c Calendar
     * @param ms int
     */
    public static void CalendarSetTimeMS(Calendar c, int ms) {
        c.setTime(ms);
    }

    //VIBRATOR\\
    /**
     * Vibrate for the set amount of time - Time Unit: millisecond
     * <h3>*You need to add <code>sketch.Logic.variables.Vibrator</code> to use
     * this</h3>
     *
     * @param v Vibrator
     * @param ms int (milliseconds)
     */
    public static void VibratorVibrateForMS(Vibrator v, int ms) {
        v.vibrate(ms, new Activity());
    }

    //TIMER\\
    /**
     * <h1>NOT SUPPORTED YET</h1>
     * Execute the blocks after a set time period <br>
     * - Time Unit: millisecond
     * <h3>*You can only set one task per timer</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Timer</code> to use
     * this</h3>
     *
     * @param t Timer
     * @param ms int (milliseconds)
     */
    public static void TimerDoAfterMS(Timer t, int ms) {
    }

    /**
     * <h1>NOT SUPPORTED YET</h1>
     * Execute the blocks after a set time period for every set time period<br>
     * - Time Unit: millisecond
     * <h3>*You can only set one tsk per timer</h3>
     * <h3>*You need to add <code>sketch.Logic.variables.Timer</code> to use
     * this</h3>
     *
     * @param t Timer
     * @param msAfter int, after ms the <code>Timer</code> starts
     * @param msEvery int, for every ms the code must be executed
     */
    public static void TimerDoAfterMsForEveryMs(Timer t, int msAfter, int msEvery) {
    }

    /**
     * <h1>NOT SUPPORTED YET</h1>
     * Cancels the designed timer task<br>
     * - Time Unit: millisecond
     * <h3>*You need to add <code>sketch.Logic.variables.Timer</code> to use
     * this</h3>
     *
     * @param t
     */
    public static void TimerCancel(Timer t) {
    }

    //DIALOG\\
    /**
     * Set the title for the current <code>Dialog</code>
     *
     * @param d Dialog
     * @param title String
     */
    public static void DialogSetTitle(Dialog d, String title) {
        d.setTitle(title);
    }

    /**
     * Set the body message for the <code>Dialog</code>
     *
     * @param d Dialog
     * @param message String
     */
    public static void DialogSetMessage(Dialog d, String message) {
        d.setMessage(message);
    }

    /**
     * Determine the action for OK Pressed
     *
     * @param d Dialog
     * @param l ActionListener
     */
    public static void DialogOKButtonClicked(Dialog d, ActionListener l) {
        d.setOkButtonListener("OK", l);
    }

    /**
     * Determine the action for Cancel Pressed
     *
     * @param d Dialog
     * @param l ActionListener
     */
    public static void DialogCancelButtonClicked(Dialog d, ActionListener l) {
        d.setCancelButtonListener("Cancel", l);
    }

    /**
     * Determine the action for Neutral button (<code>JButton b</code>) Pressed
     *
     * @param d Dialog
     * @param b JButton
     * @param l ActionListener
     */
    public static void DialogNeutralButtonClicked(Dialog d, JButton b, ActionListener l) {
        d.setNeutralButtonListener(b, l);
    }

    /**
     * Show the <code>Dialog</code>
     *
     * @param d Dialog
     */
    public static void DialogShow(Dialog d) {
        d.Show(d);
    }

    //MEDIAPLAYER\\
    /**
     * <h1>NOT SUPPORTED YET</h1>
     * Initialize the MediaPlayer with a sound
     *
     * @param m MediaPlayer
     * @param s <code>Sound</code> (<strong>IN DEVELOPMENT</strong>)
     */
    public static void MediaPlayerCreate(MediaPlayer m, /*Sound*/ String s) {
    }

    /**
     * Start the MediaPlayer
     *
     * @param m MediaPlayer
     */
    public static void MediaPlayerStart(MediaPlayer m) {
    }

    /**
     * Pause the MediaPlayer
     *
     * @param m
     */
    public static void MediaPlayerPause(MediaPlayer m) {
    }

    /**
     * Seeks the MediaPlayer to given milleseconds
     *
     * @param m MediaPlayer
     * @param ms int
     */
    public static void MediaPlayerSeekTo(MediaPlayer m, int ms) {
    }

    /**
     * Get the current duration in milliseconds
     *
     * @param m MediaPlayer
     * @return <code>int</code> ms
     */
    public static int MediaPlayerGetCurrentDuration(MediaPlayer m) {
        return 0;
    }

    /**
     * Get the duration of the sound in milliseconds
     * @param m MediaPlayer
     * @return <code>int</code> ms
     */
    public static int MediaPlayerGetSongDuration(MediaPlayer m) {
        return m.getDuration();
    }

    /**
     * Check if MediPlayer is playing
     * @param m MediaPlayer
     * @return <code>boolean</code> isPlaying
     */
    public static boolean MediaPlayerIsPlaying(MediaPlayer m){
        return m.isPlaying;
    }

    /**
     * Enable or Disable loop for the sound
     * @param m MediaPlayer
     * @param b boolean
     */
    public static void MediaPlayerSetLooping(MediaPlayer m, boolean b){
        m.isLooping = b;
    }

    /**
     * Check if the sound is on loop
     * @param m
     * @return <code>boolean</code> isLooping
     */
    public static boolean MediaPlayerIsLooping(MediaPlayer m){
        return m.isLooping;
    }

    /**
     * Reset the MediaPlayer to initial state, seeking to 0 milliseconds
     * @param m MediaPlayer
     */
    public static void MediaPlayerReset(MediaPlayer m){
      m.setSeek(0);
    }

    /**
     * Release the sound MediaPlayer is holding onto
     * @param m MediaPlayer
     */
    public static void MediaPlayerRelease(MediaPlayer m){
      m.continue();
    }

    /**
     *
     */
     public static void SoundPoolCreateMaxStreamCount(SoundPool sp, int sounds){
       sp.setMaxSounds(sounds);
     }
}
