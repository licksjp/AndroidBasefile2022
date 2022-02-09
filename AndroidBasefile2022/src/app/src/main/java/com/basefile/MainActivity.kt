package com.basefile

import android.content.Context
import android.os.Bundle
import android.os.Vibrator
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import android.app.AlertDialog
class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener{
    var No = 0
    var VIBRATION_ON = 1
    var mode=0
    var flag=0

    private var textToSpeech: TextToSpeech? = null
    private val tts: TextToSpeech? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        textToSpeech = TextToSpeech(this, this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = getString(R.string.Ready_Message)
        //SpeechText(getString("テスト".toString()))
        // ボタンを設定
        // ボタンを設定
        var Screenview: TextView = findViewById<TextView>(R.id.view_screen) as TextView
        val Button1: Button = findViewById<Button>(R.id.button_1) as Button

        val Button2: Button = findViewById<Button>(R.id.button_2) as Button

        val Button3: Button = findViewById<Button>(R.id.button_3) as Button

        val Button4: Button = findViewById<Button>(R.id.button_4) as Button

        val Button5: Button = findViewById<Button>(R.id.button_5) as Button

        val Button6: Button = findViewById<Button>(R.id.button_6) as Button

        val Button7: Button = findViewById<Button>(R.id.button_7) as Button

        val Button8: Button = findViewById<Button>(R.id.button_8) as Button

        val Button9: Button = findViewById<Button>(R.id.button_9) as Button

        val Button_Clear: Button = findViewById<Button>(R.id.button_Clear) as Button

        val Button0: Button = findViewById<Button>(R.id.button_0) as Button

        val Button_EXE: Button = findViewById<Button>(R.id.button_EXE) as Button


        Button1.setOnClickListener {
            Vibration()
            No=1
            when(mode)
            {
                1->{
                    flag=1
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.TopMenu_Select1,No))
                }
                4->{
                    flag=4
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.Help_Select1,No))
                }
                // val messageView: TextView = findViewById(R.id.view_screen)
                // messageView.text = (getString(R.string.TopMenu_NoSelect))
                // String.format(R.string.TopMenu_NoSelect,No)

            }
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button2.setOnClickListener {
            Vibration()
            No=2
            when(mode)
            {
                1->{
                    flag=1
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.TopMenu_Select2,No))
                }
                4->{
                    flag=5
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.Help_Select2,No))
                }
                // val messageView: TextView = findViewById(R.id.view_screen)
                // messageView.text = (getString(R.string.TopMenu_NoSelect))
                // String.format(R.string.TopMenu_NoSelect,No)

            }
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button3.setOnClickListener {
            Vibration()
            No=3
            when(mode)
            {
                1->{
                    flag=3
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.TopMenu_Select3,No))
                }

                // val messageView: TextView = findViewById(R.id.view_screen)
                // messageView.text = (getString(R.string.TopMenu_NoSelect))
                // String.format(R.string.TopMenu_NoSelect,No)

            }
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button4.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button5.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button6.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button7.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button8.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button9.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button_Clear.setOnClickListener {
            Vibration()
            flag=0
            mode=0
            No=0
            val messageView: TextView = findViewById(R.id.view_screen)
            messageView.text = (getString(R.string.TopMessage))

            Toast.makeText(this,R.string.AllClearMessage, Toast.LENGTH_SHORT).show()
        }
        Button_EXE.setOnClickListener {
            Vibration()
            No=0
            when(flag)
            {
                0->{
                    mode=1
                    val messageView: TextView = findViewById(R.id.view_screen)
                     messageView.text = (getString(R.string.TopMenu_NoSelect,No))
                }
                1->{
                    /*トップ画面
                       select1 トップ画面のコンテンツ
                     */
                    mode=2
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.TopMenu_NoSelect,No))

                }
                    2->{
                    /*トップ画面
                       select2 設定のコンテンツ
                     */
                    mode=3
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.TopMenu_NoSelect,No))

                }
                3->{
                    /*トップ画面
                       select3 Helpのコンテンツ
                     */
                    mode=4
                    val messageView: TextView = findViewById(R.id.view_screen)
                    messageView.text = (getString(R.string.Help_NoSelect,No))

                }
                4->{
                    /*トップ画面
                       select3 Helpのコンテンツ Version Dialog
                     */
                    VersionDialog()
                }
                5->{
                    ReferenceBookDialog()
                }
                // val messageView: TextView = findViewById(R.id.view_screen)
                   // messageView.text = (getString(R.string.TopMenu_NoSelect))
               // String.format(R.string.TopMenu_NoSelect,No)

            }
            //Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }
        Button0.setOnClickListener {
            Vibration()
            Toast.makeText(this, "テストメッセージです", Toast.LENGTH_SHORT).show()
        }


    }



    fun Vibration() {
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(200) // 200 ms
    }
    override fun onDestroy() {
        textToSpeech?.shutdown()
        super.onDestroy()
    }
    override fun onStop() {
        super.onStop()
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.cancel()
    }
    /*
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
        //  var text = TextToSpeech.toString()

        //   SpeechText(text)
    }

     */
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            Log.d("tts","TextToSpeech初期化成功")
           // var text = getString(R.string.Ready_Message)
           // SpeechText(text)
            val listener = object : UtteranceProgressListener(){
                var tag : String = "TTS"
                override fun onDone(utteranceId: String?) {
                    Log.d(tag,"音声再生が完了しました。")

                }
                override fun onError(utteranceId: String?) {
                    Log.d(tag,"音声再生中にエラーが発生しました。")
                }
                override fun onError(utteranceId: String?, errorCode: Int) {
                    Log.d(tag,"音声再生中にエラーが発生しました。")
                }
                override fun onStart(utteranceId: String?) {
                    Log.d(tag,"音声再生を開始します。")
                }
                override fun onStop(utteranceId: String?, interrupted: Boolean) {
                    Log.d(tag,"音声再生を中止します。")
                }
                override fun onBeginSynthesis(utteranceId: String?, sampleRateInHz: Int, audioFormat: Int, channelCount: Int) {
                    Log.d(tag,"音声の合成を開始します。")
                }
                override fun onAudioAvailable(utteranceId: String?, audio: ByteArray?) {
                    Log.d(tag,"音声が利用可能になりました。")
                }
            }
            // イベントリスナを登録
            tts?.setOnUtteranceProgressListener(listener)
        }else{
            Log.d("tts","TextToSpeech初期化失敗")
        }
    }
/*
    private fun SpeechText(text:String){
        tts?.setLanguage(Locale.JAPANESE)
        tts?.speak(text,TextToSpeech.QUEUE_FLUSH,null,"ID")
    }
*/
    private fun startSpeak(text: String, isImmediately: Boolean) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            textToSpeech?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "utteranceId")
        }
    }
//Version Dialog
    fun VersionDialog()
{
    AlertDialog.Builder(this)
        .setTitle(R.string.VersionTitle)
        .setMessage(R.string.VersionSentense)
        .setPositiveButton(R.string.Ok) { dialog, which -> }
        .show()


    //return builder.create()
    }
//参考文献
fun ReferenceBookDialog()
{
    AlertDialog.Builder(this)
        .setTitle(R.string.ReferenceBookTitle)
        .setMessage(R.string.ReferenceBookSentense)
        .setPositiveButton(R.string.Ok) { dialog, which -> }
        .show()


    //return builder.create()
}
}
