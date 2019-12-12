package com.example.barbellapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;


public class LegendsHome extends AppCompatActivity {

    TextView Jan1, Jan2, Jan3, Jan4, Jan5, Jan6, Jan7, Jan8, Jan9, Jan10, Jan11, Jan12, Jan13, Jan14,
        Jan15, Jan16, Jan17, Jan18, Jan19, Jan20, Jan21, Jan22, Jan23, Jan24, Jan25, Jan26, Jan27,
        Jan28, Jan29, Jan30, Jan31, Feb1, Feb2, Feb3, Feb4, Feb5, Feb6, Feb7, Feb8, Feb9, Feb10,
        Feb11, Feb12, Feb13, Feb14, Feb15, Feb16, Feb17, Feb18, Feb19, Feb20, Feb21, Feb22, Feb23,
        Feb24, Feb25, Feb26, Feb27, Feb28, Feb29, Mar1, Mar2, Mar3, Mar4, Mar5, Mar6, Mar7, Mar8,
        Mar9, Mar10, Mar11, Mar12, Mar13, Mar14, Mar15, Mar16, Mar17, Mar18, Mar19, Mar20, Mar21,
        Mar22, Mar23, Mar24, Mar25, Mar26, Mar27, Mar28, Mar29, Mar30, Mar31, Apr1, Apr2, Apr3,
        Apr4, Apr5, Apr6, Apr7, Apr8, Apr9, Apr10, Apr11, Apr12, Apr13, Apr14, Apr15, Apr16, Apr17,
        Apr18, Apr19, Apr20, Apr21, Apr22, Apr23, Apr24, Apr25, Apr26, Apr27, Apr28, Apr29, Apr30,
        May1, May2, May3, May4, May5, May6, May7, May8, May9, May10, May11, May12, May13, May14,
        May15, May16, May17, May18, May19, May20, May21, May22, May23, May24, May25, May26, May27,
        May28, May29, May30, May31, Jun1, Jun2, Jun3, Jun4, Jun5, Jun6, Jun7, Jun8, Jun9, Jun10,
        Jun11, Jun12, Jun13, Jun14, Jun15, Jun16, Jun17, Jun18, Jun19, Jun20, Jun21, Jun22, Jun23,
        Jun24, Jun25, Jun26, Jun27, Jun28, Jun29, Jun30, Jul1, Jul2, Jul3, Jul4, Jul5, Jul6, Jul7,
        Jul8, Jul9, Jul10, Jul11, Jul12, Jul13, Jul14, Jul15, Jul16, Jul17, Jul18, Jul19, Jul20,
        Jul21, Jul22, Jul23, Jul24, Jul25, Jul26, Jul27, Jul28, Jul29, Jul30, Jul31, Aug1, Aug2,
        Aug3, Aug4, Aug5, Aug6, Aug7, Aug8, Aug9, Aug10, Aug11, Aug12, Aug13, Aug14, Aug15, Aug16,
        Aug17, Aug18, Aug19, Aug20, Aug21, Aug22, Aug23, Aug24, Aug25, Aug26, Aug27, Aug28, Aug29,
        Aug30, Aug31, Sep1, Sep2, Sep3, Sep4, Sep5, Sep6, Sep7, Sep8, Sep9, Sep10, Sep11, Sep12,
        Sep13, Sep14, Sep15, Sep16, Sep17, Sep18, Sep19, Sep20, Sep21, Sep22, Sep23, Sep24, Sep25,
        Sep26, Sep27, Sep28, Sep29, Sep30, Oct1, Oct2, Oct3, Oct4, Oct5, Oct6, Oct7, Oct8, Oct9,
        Oct10, Oct11, Oct12, Oct13, Oct14, Oct15, Oct16, Oct17, Oct18, Oct19, Oct20, Oct21, Oct22,
        Oct23, Oct24, Oct25, Oct26, Oct27, Oct28, Oct29, Oct30, Oct31, Nov1, Nov2, Nov3, Nov4, Nov5, 
        Nov6, Nov7, Nov8, Nov9, Nov10, Nov11, Nov12, Nov13, Nov14, Nov15, Nov16, Nov17, Nov18,
        Nov19, Nov20, Nov21, Nov22, Nov23, Nov24, Nov25, Nov26, Nov27, Nov28, Nov29, Nov30, Dec1,
        Dec2, Dec3, Dec4, Dec5, Dec6, Dec7, Dec8, Dec9, Dec10, Dec11, Dec12, Dec13, Dec14, Dec15,
        Dec16, Dec17, Dec18, Dec19, Dec20, Dec21, Dec22, Dec23, Dec24, Dec25, Dec26, Dec27, Dec28,
        Dec29, Dec30, Dec31;
    ImageButton home, profile, more;
    TextView wodTest;
    HorizontalScrollView dateScroll;
    String today, date, month;
    int intYear, intMonth, intDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legends_home);


       //findViewByID for dates
        Jan1 = findViewById(R.id.lhJan1);
        Jan2 = findViewById(R.id.lhJan2);
        Jan3 = findViewById(R.id.lhJan3);
        Jan4 = findViewById(R.id.lhJan4);
        Jan5 = findViewById(R.id.lhJan5);
        Jan6 = findViewById(R.id.lhJan6);
        Jan7 = findViewById(R.id.lhJan7);
        Jan8 = findViewById(R.id.lhJan8);
        Jan9 = findViewById(R.id.lhJan9);
        Jan10 = findViewById(R.id.lhJan10);
        Jan11 = findViewById(R.id.lhJan11);
        Jan12 = findViewById(R.id.lhJan12);
        Jan13 = findViewById(R.id.lhJan13);
        Jan14 = findViewById(R.id.lhJan14);
        Jan15 = findViewById(R.id.lhJan15);
        Jan16 = findViewById(R.id.lhJan16);
        Jan17 = findViewById(R.id.lhJan17);
        Jan18 = findViewById(R.id.lhJan18);
        Jan19 = findViewById(R.id.lhJan19);
        Jan20 = findViewById(R.id.lhJan20);
        Jan21 = findViewById(R.id.lhJan21);
        Jan22 = findViewById(R.id.lhJan22);
        Jan23 = findViewById(R.id.lhJan23);
        Jan24 = findViewById(R.id.lhJan24);
        Jan25 = findViewById(R.id.lhJan25);
        Jan26 = findViewById(R.id.lhJan26);
        Jan27 = findViewById(R.id.lhJan27);
        Jan28 = findViewById(R.id.lhJan28);
        Jan29 = findViewById(R.id.lhJan29);
        Jan30 = findViewById(R.id.lhJan30);
        Jan31 = findViewById(R.id.lhJan31);
        Feb1 = findViewById(R.id.lhFeb1);
        Feb2 = findViewById(R.id.lhFeb2);
        Feb3 = findViewById(R.id.lhFeb3);
        Feb4 = findViewById(R.id.lhFeb4);
        Feb5 = findViewById(R.id.lhFeb5);
        Feb6 = findViewById(R.id.lhFeb6);
        Feb7 = findViewById(R.id.lhFeb7);
        Feb8 = findViewById(R.id.lhFeb8);
        Feb9 = findViewById(R.id.lhFeb9);
        Feb10 = findViewById(R.id.lhFeb10);
        Feb11 = findViewById(R.id.lhFeb11);
        Feb12 = findViewById(R.id.lhFeb12);
        Feb13 = findViewById(R.id.lhFeb13);
        Feb14 = findViewById(R.id.lhFeb14);
        Feb15 = findViewById(R.id.lhFeb15);
        Feb16 = findViewById(R.id.lhFeb16);
        Feb17 = findViewById(R.id.lhFeb17);
        Feb18 = findViewById(R.id.lhFeb18);
        Feb19 = findViewById(R.id.lhFeb19);
        Feb20 = findViewById(R.id.lhFeb20);
        Feb21 = findViewById(R.id.lhFeb21);
        Feb22 = findViewById(R.id.lhFeb22);
        Feb23 = findViewById(R.id.lhFeb23);
        Feb24 = findViewById(R.id.lhFeb24);
        Feb25 = findViewById(R.id.lhFeb25);
        Feb26 = findViewById(R.id.lhFeb26);
        Feb27 = findViewById(R.id.lhFeb27);
        Feb28 = findViewById(R.id.lhFeb28);
        Feb29 = findViewById(R.id.lhFeb29);
        Mar1 = findViewById(R.id.lhMar1);
        Mar2 = findViewById(R.id.lhMar2);
        Mar3 = findViewById(R.id.lhMar3);
        Mar4 = findViewById(R.id.lhMar4);
        Mar5 = findViewById(R.id.lhMar5);
        Mar6 = findViewById(R.id.lhMar6);
        Mar7 = findViewById(R.id.lhMar7);
        Mar8 = findViewById(R.id.lhMar8);
        Mar9 = findViewById(R.id.lhMar9);
        Mar10 = findViewById(R.id.lhMar10);
        Mar11 = findViewById(R.id.lhMar11);
        Mar12 = findViewById(R.id.lhMar12);
        Mar13 = findViewById(R.id.lhMar13);
        Mar14 = findViewById(R.id.lhMar14);
        Mar15 = findViewById(R.id.lhMar15);
        Mar16 = findViewById(R.id.lhMar16);
        Mar17 = findViewById(R.id.lhMar17);
        Mar18 = findViewById(R.id.lhMar18);
        Mar19 = findViewById(R.id.lhMar19);
        Mar20 = findViewById(R.id.lhMar20);
        Mar21 = findViewById(R.id.lhMar21);
        Mar22 = findViewById(R.id.lhMar22);
        Mar23 = findViewById(R.id.lhMar23);
        Mar24 = findViewById(R.id.lhMar24);
        Mar25 = findViewById(R.id.lhMar25);
        Mar26 = findViewById(R.id.lhMar26);
        Mar27 = findViewById(R.id.lhMar27);
        Mar28 = findViewById(R.id.lhMar28);
        Mar29 = findViewById(R.id.lhMar29);
        Mar30 = findViewById(R.id.lhMar30);
        Mar31 = findViewById(R.id.lhMar31);
        Apr1 = findViewById(R.id.lhApr1);
        Apr2 = findViewById(R.id.lhApr2);
        Apr3 = findViewById(R.id.lhApr3);
        Apr4 = findViewById(R.id.lhApr4);
        Apr5 = findViewById(R.id.lhApr5);
        Apr6 = findViewById(R.id.lhApr6);
        Apr7 = findViewById(R.id.lhApr7);
        Apr8 = findViewById(R.id.lhApr8);
        Apr9 = findViewById(R.id.lhApr9);
        Apr10 = findViewById(R.id.lhApr10);
        Apr11 = findViewById(R.id.lhApr11);
        Apr12 = findViewById(R.id.lhApr12);
        Apr13 = findViewById(R.id.lhApr13);
        Apr14 = findViewById(R.id.lhApr14);
        Apr15 = findViewById(R.id.lhApr15);
        Apr16 = findViewById(R.id.lhApr16);
        Apr17 = findViewById(R.id.lhApr17);
        Apr18 = findViewById(R.id.lhApr18);
        Apr19 = findViewById(R.id.lhApr19);
        Apr20 = findViewById(R.id.lhApr20);
        Apr21 = findViewById(R.id.lhApr21);
        Apr22 = findViewById(R.id.lhApr22);
        Apr23 = findViewById(R.id.lhApr23);
        Apr24 = findViewById(R.id.lhApr24);
        Apr25 = findViewById(R.id.lhApr25);
        Apr26 = findViewById(R.id.lhApr26);
        Apr27 = findViewById(R.id.lhApr27);
        Apr28 = findViewById(R.id.lhApr28);
        Apr29 = findViewById(R.id.lhApr29);
        Apr30 = findViewById(R.id.lhApr30);
        May1 = findViewById(R.id.lhMay1);
        May2 = findViewById(R.id.lhMay2);
        May3 = findViewById(R.id.lhMay3);
        May4 = findViewById(R.id.lhMay4);
        May5 = findViewById(R.id.lhMay5);
        May6 = findViewById(R.id.lhMay6);
        May7 = findViewById(R.id.lhMay7);
        May8 = findViewById(R.id.lhMay8);
        May9 = findViewById(R.id.lhMay9);
        May10 = findViewById(R.id.lhMay10);
        May11 = findViewById(R.id.lhMay11);
        May12 = findViewById(R.id.lhMay12);
        May13 = findViewById(R.id.lhMay13);
        May14 = findViewById(R.id.lhMay14);
        May15 = findViewById(R.id.lhMay15);
        May16 = findViewById(R.id.lhMay16);
        May17 = findViewById(R.id.lhMay17);
        May18 = findViewById(R.id.lhMay18);
        May19 = findViewById(R.id.lhMay19);
        May20 = findViewById(R.id.lhMay20);
        May21 = findViewById(R.id.lhMay21);
        May22 = findViewById(R.id.lhMay22);
        May23 = findViewById(R.id.lhMay23);
        May24 = findViewById(R.id.lhMay24);
        May25 = findViewById(R.id.lhMay25);
        May26 = findViewById(R.id.lhMay26);
        May27 = findViewById(R.id.lhMay27);
        May28 = findViewById(R.id.lhMay28);
        May29 = findViewById(R.id.lhMay29);
        May30 = findViewById(R.id.lhMay30);
        May31 = findViewById(R.id.lhMay31);
        Jun1 = findViewById(R.id.lhJun1);
        Jun2 = findViewById(R.id.lhJun2);
        Jun3 = findViewById(R.id.lhJun3);
        Jun4 = findViewById(R.id.lhJun4);
        Jun5 = findViewById(R.id.lhJun5);
        Jun6 = findViewById(R.id.lhJun6);
        Jun7 = findViewById(R.id.lhJun7);
        Jun8 = findViewById(R.id.lhJun8);
        Jun9 = findViewById(R.id.lhJun9);
        Jun10 = findViewById(R.id.lhJun10);
        Jun11 = findViewById(R.id.lhJun11);
        Jun12 = findViewById(R.id.lhJun12);
        Jun13 = findViewById(R.id.lhJun13);
        Jun14 = findViewById(R.id.lhJun14);
        Jun15 = findViewById(R.id.lhJun15);
        Jun16 = findViewById(R.id.lhJun16);
        Jun17 = findViewById(R.id.lhJun17);
        Jun18 = findViewById(R.id.lhJun18);
        Jun19 = findViewById(R.id.lhJun19);
        Jun20 = findViewById(R.id.lhJun20);
        Jun21 = findViewById(R.id.lhJun21);
        Jun22 = findViewById(R.id.lhJun22);
        Jun23 = findViewById(R.id.lhJun23);
        Jun24 = findViewById(R.id.lhJun24);
        Jun25 = findViewById(R.id.lhJun25);
        Jun26 = findViewById(R.id.lhJun26);
        Jun27 = findViewById(R.id.lhJun27);
        Jun28 = findViewById(R.id.lhJun28);
        Jun29 = findViewById(R.id.lhJun29);
        Jun30 = findViewById(R.id.lhJun30);
        Jul1 = findViewById(R.id.lhJul1);
        Jul2 = findViewById(R.id.lhJul2);
        Jul3 = findViewById(R.id.lhJul3);
        Jul4 = findViewById(R.id.lhJul4);
        Jul5 = findViewById(R.id.lhJul5);
        Jul6 = findViewById(R.id.lhJul6);
        Jul7 = findViewById(R.id.lhJul7);
        Jul8 = findViewById(R.id.lhJul8);
        Jul9 = findViewById(R.id.lhJul9);
        Jul10 = findViewById(R.id.lhJul10);
        Jul11 = findViewById(R.id.lhJul11);
        Jul12 = findViewById(R.id.lhJul12);
        Jul13 = findViewById(R.id.lhJul13);
        Jul14 = findViewById(R.id.lhJul14);
        Jul15 = findViewById(R.id.lhJul15);
        Jul16 = findViewById(R.id.lhJul16);
        Jul17 = findViewById(R.id.lhJul17);
        Jul18 = findViewById(R.id.lhJul18);
        Jul19 = findViewById(R.id.lhJul19);
        Jul20 = findViewById(R.id.lhJul20);
        Jul21 = findViewById(R.id.lhJul21);
        Jul22 = findViewById(R.id.lhJul22);
        Jul23 = findViewById(R.id.lhJul23);
        Jul24 = findViewById(R.id.lhJul24);
        Jul25 = findViewById(R.id.lhJul25);
        Jul26 = findViewById(R.id.lhJul26);
        Jul27 = findViewById(R.id.lhJul27);
        Jul28 = findViewById(R.id.lhJul28);
        Jul29 = findViewById(R.id.lhJul29);
        Jul30 = findViewById(R.id.lhJul30);
        Jul31 = findViewById(R.id.lhJul31);
        Aug1 = findViewById(R.id.lhAug1);
        Aug2 = findViewById(R.id.lhAug2);
        Aug3 = findViewById(R.id.lhAug3);
        Aug4 = findViewById(R.id.lhAug4);
        Aug5 = findViewById(R.id.lhAug5);
        Aug6 = findViewById(R.id.lhAug6);
        Aug7 = findViewById(R.id.lhAug7);
        Aug8 = findViewById(R.id.lhAug8);
        Aug9 = findViewById(R.id.lhAug9);
        Aug10 = findViewById(R.id.lhAug10);
        Aug11 = findViewById(R.id.lhAug11);
        Aug12 = findViewById(R.id.lhAug12);
        Aug13 = findViewById(R.id.lhAug13);
        Aug14 = findViewById(R.id.lhAug14);
        Aug15 = findViewById(R.id.lhAug15);
        Aug16 = findViewById(R.id.lhAug16);
        Aug17 = findViewById(R.id.lhAug17);
        Aug18 = findViewById(R.id.lhAug18);
        Aug19 = findViewById(R.id.lhAug19);
        Aug20 = findViewById(R.id.lhAug20);
        Aug21 = findViewById(R.id.lhAug21);
        Aug22 = findViewById(R.id.lhAug22);
        Aug23 = findViewById(R.id.lhAug23);
        Aug24 = findViewById(R.id.lhAug24);
        Aug25 = findViewById(R.id.lhAug25);
        Aug26 = findViewById(R.id.lhAug26);
        Aug27 = findViewById(R.id.lhAug27);
        Aug28 = findViewById(R.id.lhAug28);
        Aug29 = findViewById(R.id.lhAug29);
        Aug30 = findViewById(R.id.lhAug30);
        Aug31 = findViewById(R.id.lhAug31);
        Sep1 = findViewById(R.id.lhSep1);
        Sep2 = findViewById(R.id.lhSep2);
        Sep3 = findViewById(R.id.lhSep3);
        Sep4 = findViewById(R.id.lhSep4);
        Sep5 = findViewById(R.id.lhSep5);
        Sep6 = findViewById(R.id.lhSep6);
        Sep7 = findViewById(R.id.lhSep7);
        Sep8 = findViewById(R.id.lhSep8);
        Sep9 = findViewById(R.id.lhSep9);
        Sep10 = findViewById(R.id.lhSep10);
        Sep11 = findViewById(R.id.lhSep11);
        Sep12 = findViewById(R.id.lhSep12);
        Sep13 = findViewById(R.id.lhSep13);
        Sep14 = findViewById(R.id.lhSep14);
        Sep15 = findViewById(R.id.lhSep15);
        Sep16 = findViewById(R.id.lhSep16);
        Sep17 = findViewById(R.id.lhSep17);
        Sep18 = findViewById(R.id.lhSep18);
        Sep19 = findViewById(R.id.lhSep19);
        Sep20 = findViewById(R.id.lhSep20);
        Sep21 = findViewById(R.id.lhSep21);
        Sep22 = findViewById(R.id.lhSep22);
        Sep23 = findViewById(R.id.lhSep23);
        Sep24 = findViewById(R.id.lhSep24);
        Sep25 = findViewById(R.id.lhSep25);
        Sep26 = findViewById(R.id.lhSep26);
        Sep27 = findViewById(R.id.lhSep27);
        Sep28 = findViewById(R.id.lhSep28);
        Sep29 = findViewById(R.id.lhSep29);
        Sep30 = findViewById(R.id.lhSep30);
        Oct1 = findViewById(R.id.lhOct1);
        Oct2 = findViewById(R.id.lhOct2);
        Oct3 = findViewById(R.id.lhOct3);
        Oct4 = findViewById(R.id.lhOct4);
        Oct5 = findViewById(R.id.lhOct5);
        Oct6 = findViewById(R.id.lhOct6);
        Oct7 = findViewById(R.id.lhOct7);
        Oct8 = findViewById(R.id.lhOct8);
        Oct9 = findViewById(R.id.lhOct9);
        Oct10 = findViewById(R.id.lhOct10);
        Oct11 = findViewById(R.id.lhOct11);
        Oct12 = findViewById(R.id.lhOct12);
        Oct13 = findViewById(R.id.lhOct13);
        Oct14 = findViewById(R.id.lhOct14);
        Oct15 = findViewById(R.id.lhOct15);
        Oct16 = findViewById(R.id.lhOct16);
        Oct17 = findViewById(R.id.lhOct17);
        Oct18 = findViewById(R.id.lhOct18);
        Oct19 = findViewById(R.id.lhOct19);
        Oct20 = findViewById(R.id.lhOct20);
        Oct21 = findViewById(R.id.lhOct21);
        Oct22 = findViewById(R.id.lhOct22);
        Oct23 = findViewById(R.id.lhOct23);
        Oct24 = findViewById(R.id.lhOct24);
        Oct25 = findViewById(R.id.lhOct25);
        Oct26 = findViewById(R.id.lhOct26);
        Oct27 = findViewById(R.id.lhOct27);
        Oct28 = findViewById(R.id.lhOct28);
        Oct29 = findViewById(R.id.lhOct29);
        Oct30 = findViewById(R.id.lhOct30);
        Oct31 = findViewById(R.id.lhOct31);
        Nov1 = findViewById(R.id.lhNov1);
        Nov2 = findViewById(R.id.lhNov2);
        Nov3 = findViewById(R.id.lhNov3);
        Nov4 = findViewById(R.id.lhNov4);
        Nov5 = findViewById(R.id.lhNov5);
        Nov6 = findViewById(R.id.lhNov6);
        Nov7 = findViewById(R.id.lhNov7);
        Nov8 = findViewById(R.id.lhNov8);
        Nov9 = findViewById(R.id.lhNov9);
        Nov10 = findViewById(R.id.lhNov10);
        Nov11 = findViewById(R.id.lhNov11);
        Nov12 = findViewById(R.id.lhNov12);
        Nov13 = findViewById(R.id.lhNov13);
        Nov14 = findViewById(R.id.lhNov14);
        Nov15 = findViewById(R.id.lhNov15);
        Nov16 = findViewById(R.id.lhNov16);
        Nov17 = findViewById(R.id.lhNov17);
        Nov18 = findViewById(R.id.lhNov18);
        Nov19 = findViewById(R.id.lhNov19);
        Nov20 = findViewById(R.id.lhNov20);
        Nov21 = findViewById(R.id.lhNov21);
        Nov22 = findViewById(R.id.lhNov22);
        Nov23 = findViewById(R.id.lhNov23);
        Nov24 = findViewById(R.id.lhNov24);
        Nov25 = findViewById(R.id.lhNov25);
        Nov26 = findViewById(R.id.lhNov26);
        Nov27 = findViewById(R.id.lhNov27);
        Nov28 = findViewById(R.id.lhNov28);
        Nov29 = findViewById(R.id.lhNov29);
        Nov30 = findViewById(R.id.lhNov30);
        Dec1 = findViewById(R.id.lhDec1);
        Dec2 = findViewById(R.id.lhDec2);
        Dec3 = findViewById(R.id.lhDec3);
        Dec4 = findViewById(R.id.lhDec4);
        Dec5 = findViewById(R.id.lhDec5);
        Dec6 = findViewById(R.id.lhDec6);
        Dec7 = findViewById(R.id.lhDec7);
        Dec8 = findViewById(R.id.lhDec8);
        Dec9 = findViewById(R.id.lhDec9);
        Dec10 = findViewById(R.id.lhDec10);
        Dec11 = findViewById(R.id.lhDec11);
        Dec12 = findViewById(R.id.lhDec12);
        Dec13 = findViewById(R.id.lhDec13);
        Dec14 = findViewById(R.id.lhDec14);
        Dec15 = findViewById(R.id.lhDec15);
        Dec16 = findViewById(R.id.lhDec16);
        Dec17 = findViewById(R.id.lhDec17);
        Dec18 = findViewById(R.id.lhDec18);
        Dec19 = findViewById(R.id.lhDec19);
        Dec20 = findViewById(R.id.lhDec20);
        Dec21 = findViewById(R.id.lhDec21);
        Dec22 = findViewById(R.id.lhDec22);
        Dec23 = findViewById(R.id.lhDec23);
        Dec24 = findViewById(R.id.lhDec24);
        Dec25 = findViewById(R.id.lhDec25);
        Dec26 = findViewById(R.id.lhDec26);
        Dec27 = findViewById(R.id.lhDec27);
        Dec28 = findViewById(R.id.lhDec28);
        Dec29 = findViewById(R.id.lhDec29);
        Dec30 = findViewById(R.id.lhDec30);
        Dec31 = findViewById(R.id.lhDec31);
        wodTest = findViewById(R.id.lhWOD);
        home = findViewById(R.id.lhHomeButton);
        profile = findViewById(R.id.lhProfileButton);
        more = findViewById(R.id.lhMoreButton);
        dateScroll = findViewById(R.id.lhDateScroll);
        Calendar calendar = Calendar.getInstance();
        intYear = calendar.get(Calendar.YEAR);
        intMonth = calendar.get(Calendar.MONTH) + 1;
        intDay = calendar.get(Calendar.DAY_OF_MONTH);
        date = intMonth + "/" + intDay;
        today = DateFormat.getDateInstance(DateFormat.SHORT).format(calendar.getTime());

        switch(date){
            case "1/1":
                Jan1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/2":
                Jan2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/3":
                Jan3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/4":
                Jan4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/5":
                Jan5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/6":
                Jan6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/7":
                Jan7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/8":
                Jan8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/9":
                Jan9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/10":
                Jan10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/11":
                Jan11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/12":
                Jan12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/13":
                Jan13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/14":
                Jan14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/15":
                Jan15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/16":
                Jan16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/17":
                Jan17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/18":
                Jan18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/19":
                Jan19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/20":
                Jan20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/21":
                Jan21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/22":
                Jan22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/23":
                Jan23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/24":
                Jan24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/25":
                Jan25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/26":
                Jan26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/27":
                Jan27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/28":
                Jan28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/29":
                Jan29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/30":
                Jan30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "1/31":
                Jan31.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/1":
                Feb1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/2":
                Feb2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/3":
                Feb3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/4":
                Feb4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/5":
                Feb5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/6":
                Feb6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/7":
                Feb7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/8":
                Feb8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/9":
                Feb9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/10":
                Feb10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/11":
                Feb11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/12":
                Feb12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/13":
                Feb13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/14":
                Feb14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/15":
                Feb15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/16":
                Feb16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/17":
                Feb17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/18":
                Feb18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/19":
                Feb19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/20":
                Feb20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/21":
                Feb21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/22":
                Feb22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/23":
                Feb23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/24":
                Feb24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/25":
                Feb25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/26":
                Feb26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/27":
                Feb27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/28":
                Feb28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "2/29":
                Feb29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/1":
                Mar1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/2":
                Mar2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/3":
                Mar3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/4":
                Mar4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/5":
                Mar5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/6":
                Mar6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/7":
                Mar7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/8":
                Mar8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/9":
                Mar9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/10":
                Mar10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/11":
                Mar11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/12":
                Mar12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/13":
                Mar13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/14":
                Mar14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/15":
                Mar15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/16":
                Mar16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/17":
                Mar17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/18":
                Mar18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/19":
                Mar19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/20":
                Mar20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/21":
                Mar21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/22":
                Mar22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/23":
                Mar23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/24":
                Mar24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/25":
                Mar25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/26":
                Mar26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/27":
                Mar27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/28":
                Mar28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/29":
                Mar29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/30":
                Mar30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "3/31":
                Mar31.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/1":
                Apr1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/2":
                Apr2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/3":
                Apr3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/4":
                Apr4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/5":
                Apr5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/6":
                Apr6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/7":
                Apr7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/8":
                Apr8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/9":
                Apr9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/10":
                Apr10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/11":
                Apr11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/12":
                Apr12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/13":
                Apr13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/14":
                Apr14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/15":
                Apr15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/16":
                Apr16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/17":
                Apr17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/18":
                Apr18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/19":
                Apr19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/20":
                Apr20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/21":
                Apr21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/22":
                Apr22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/23":
                Apr23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/24":
                Apr24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/25":
                Apr25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/26":
                Apr26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/27":
                Apr27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/28":
                Apr28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/29":
                Apr29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "4/30":
                Apr30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/1":
                May1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/2":
                May2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/3":
                May3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/4":
                May4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/5":
                May5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/6":
                May6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/7":
                May7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/8":
                May8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/9":
                May9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/10":
                May10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/11":
                May11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/12":
                May12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/13":
                May13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/14":
                May14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/15":
                May15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/16":
                May16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/17":
                May17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/18":
                May18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/19":
                May19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/20":
                May20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/21":
                May21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/22":
                May22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/23":
                May23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/24":
                May24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/25":
                May25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/26":
                May26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/27":
                May27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/28":
                May28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/29":
                May29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/30":
                May30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "5/31":
                May31.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/1":
                Jun1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/2":
                Jun2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/3":
                Jun3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/4":
                Jun4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/5":
                Jun5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/6":
                Jun6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/7":
                Jun7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/8":
                Jun8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/9":
                Jun9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/10":
                Jun10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/11":
                Jun11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/12":
                Jun12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/13":
                Jun13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/14":
                Jun14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/15":
                Jun15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/16":
                Jun16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/17":
                Jun17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/18":
                Jun18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/19":
                Jun19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/20":
                Jun20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/21":
                Jun21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/22":
                Jun22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/23":
                Jun23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/24":
                Jun24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/25":
                Jun25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/26":
                Jun26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/27":
                Jun27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/28":
                Jun28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/29":
                Jun29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "6/30":
                Jun30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/1":
                Jul1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/2":
                Jul2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/3":
                Jul3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/4":
                Jul4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/5":
                Jul5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/6":
                Jul6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/7":
                Jul7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/8":
                Jul8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/9":
                Jul9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/10":
                Jul10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/11":
                Jul11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/12":
                Jul12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/13":
                Jul13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/14":
                Jul14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/15":
                Jul15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/16":
                Jul16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/17":
                Jul17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/18":
                Jul18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/19":
                Jul19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/20":
                Jul20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/21":
                Jul21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/22":
                Jul22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/23":
                Jul23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/24":
                Jul24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/25":
                Jul25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/26":
                Jul26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/27":
                Jul27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/28":
                Jul28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/29":
                Jul29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/30":
                Jul30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "7/31":
                Jul31.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/1":
                Aug1.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/2":
                Aug2.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/3":
                Aug3.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/4":
                Aug4.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/5":
                Aug5.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/6":
                Aug6.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/7":
                Aug7.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/8":
                Aug8.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/9":
                Aug9.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/10":
                Aug10.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/11":
                Aug11.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/12":
                Aug12.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/13":
                Aug13.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/14":
                Aug14.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/15":
                Aug15.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/16":
                Aug16.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/17":
                Aug17.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/18":
                Aug18.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/19":
                Aug19.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/20":
                Aug20.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/21":
                Aug21.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/22":
                Aug22.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/23":
                Aug23.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/24":
                Aug24.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/25":
                Aug25.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/26":
                Aug26.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/27":
                Aug27.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/28":
                Aug28.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/29":
                Aug29.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/30":
                Aug30.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            case "8/31":
                Aug31.setBackgroundResource(R.color.darkGray);
                wodTest.setText("Working");
                break;
            default:
                wodTest.setText("Not Working");
                break;
        }


        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendsHome.this, LegendsHome.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendsHome.this, LegendProfile.class));
            }
        });

        more.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(LegendsHome.this, LegendNavigation.class));
            }
        });


    }
}
