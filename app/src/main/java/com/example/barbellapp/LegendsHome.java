package com.example.barbellapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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
    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabaseReference = mDatabase.getReference();
    FirebaseAuth firebaseAuth;
    TextView wodTest, workoutSwitch;
    HorizontalScrollView dateScroll;
    String today, date, currentUserUid, currentDateSelection = "6/8", bootCamp;
    int intYear, intMonth, intDay;
    Button submitScore;
    //boolean bootCamp;

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
        bootCamp = "false";
        workoutSwitch = findViewById(R.id.lhWorkoutType);
        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser user = firebaseAuth.getCurrentUser();
        currentUserUid = FirebaseAuth.getInstance().getCurrentUser().getUid();
        currentDateSelection = date;
        submitScore = findViewById(R.id.lhSubmitScore);

        /* Sets active date based on current date */
        dateView();

        /*Sets active date selection based on user choice */
        Jan1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/1";
                dateView();
            }
        });
        Jan2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/2";
                dateView();
            }
        });
        Jan3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/3";
                dateView();
            }
        });
        Jan4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/4";
                dateView();
            }
        });
        Jan5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/5";
                dateView();
            }
        });
        Jan6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/6";
                dateView();
            }
        });
        Jan7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/7";
                dateView();
            }
        });
        Jan8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/8";
                dateView();
            }
        });
        Jan9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/9";
                dateView();
            }
        });
        Jan10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/10";
                dateView();
            }
        });
        Jan11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/11";
                dateView();
            }
        });
        Jan12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/12";
                dateView();
            }
        });
        Jan13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/13";
                dateView();
            }
        });
        Jan14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/14";
                dateView();
            }
        });
        Jan15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/15";
                dateView();
            }
        });
        Jan16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/16";
                dateView();
            }
        });
        Jan17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/17";
                dateView();
            }
        });
        Jan18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/18";
                dateView();
            }
        });
        Jan19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/19";
                dateView();
            }
        });
        Jan20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/20";
                dateView();
            }
        });
        Jan21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/21";
                dateView();
            }
        });
        Jan22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/22";
                dateView();
            }
        });
        Jan23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/23";
                dateView();
            }
        });
        Jan24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/24";
                dateView();
            }
        });
        Jan25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/25";
                dateView();
            }
        });
        Jan26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/26";
                dateView();
            }
        });
        Jan27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/27";
                dateView();
            }
        });
        Jan28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/28";
                dateView();
            }
        });
        Jan29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/29";
                dateView();
            }
        });
        Jan30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/30";
                dateView();
            }
        });
        Jan31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "1/31";
                dateView();
            }
        });
        Feb1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/1";
                dateView();
            }
        });
        Feb2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/2";
                dateView();
            }
        });
        Feb3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/3";
                dateView();
            }
        });
        Feb4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/4";
                dateView();
            }
        });
        Feb5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/5";
                dateView();
            }
        });
        Feb6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/6";
                dateView();
            }
        });
        Feb7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/7";
                dateView();
            }
        });
        Feb8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/8";
                dateView();
            }
        });
        Feb9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/9";
                dateView();
            }
        });
        Feb10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/10";
                dateView();
            }
        });
        Feb11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/11";
                dateView();
            }
        });
        Feb12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/12";
                dateView();
            }
        });
        Feb13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/13";
                dateView();
            }
        });
        Feb14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/14";
                dateView();
            }
        });
        Feb15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/15";
                dateView();
            }
        });
        Feb16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/16";
                dateView();
            }
        });
        Feb17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/17";
                dateView();
            }
        });
        Feb18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/18";
                dateView();
            }
        });
        Feb19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/19";
                dateView();
            }
        });
        Feb20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/20";
                dateView();
            }
        });
        Feb21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/21";
                dateView();
            }
        });
        Feb22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/22";
                dateView();
            }
        });
        Feb23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/23";
                dateView();
            }
        });
        Feb24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/24";
                dateView();
            }
        });
        Feb25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/25";
                dateView();
            }
        });
        Feb26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/26";
                dateView();
            }
        });
        Feb27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/27";
                dateView();
            }
        });
        Feb28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/28";
                dateView();
            }
        });
        Feb29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "2/29";
                dateView();
            }
        });
        Mar1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/1";
                dateView();
            }
        });
        Mar2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/2";
                dateView();
            }
        });
        Mar3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/3";
                dateView();
            }
        });
        Mar4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/4";
                dateView();
            }
        });
        Mar5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/5";
                dateView();
            }
        });
        Mar6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/6";
                dateView();
            }
        });
        Mar7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/7";
                dateView();
            }
        });
        Mar8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/8";
                dateView();
            }
        });
        Mar9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/9";
                dateView();
            }
        });
        Mar10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/10";
                dateView();
            }
        });
        Mar11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/11";
                dateView();
            }
        });
        Mar12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/12";
                dateView();
            }
        });
        Mar13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/13";
                dateView();
            }
        });
        Mar14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/14";
                dateView();
            }
        });
        Mar15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/15";
                dateView();
            }
        });
        Mar16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/16";
                dateView();
            }
        });
        Mar17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/17";
                dateView();
            }
        });
        Mar18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/18";
                dateView();
            }
        });
        Mar19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/19";
                dateView();
            }
        });
        Mar20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/20";
                dateView();
            }
        });
        Mar21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/21";
                dateView();
            }
        });
        Mar22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/22";
                dateView();
            }
        });
        Mar23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/23";
                dateView();
            }
        });
        Mar24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/24";
                dateView();
            }
        });
        Mar25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/25";
                dateView();
            }
        });
        Mar26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/26";
                dateView();
            }
        });
        Mar27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/27";
                dateView();
            }
        });
        Mar28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/28";
                dateView();
            }
        });
        Mar29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/29";
                dateView();
            }
        });
        Mar30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/30";
                dateView();
            }
        });
        Mar31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "3/31";
                dateView();
            }
        });
        Apr1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/1";
                dateView();
            }
        });
        Apr2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/2";
                dateView();
            }
        });
        Apr3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/3";
                dateView();
            }
        });
        Apr4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/4";
                dateView();
            }
        });
        Apr5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/5";
                dateView();
            }
        });
        Apr6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/6";
                dateView();
            }
        });
        Apr7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/7";
                dateView();
            }
        });
        Apr8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/8";
                dateView();
            }
        });
        Apr9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/9";
                dateView();
            }
        });
        Apr10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/10";
                dateView();
            }
        });
        Apr11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/11";
                dateView();
            }
        });
        Apr12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/12";
                dateView();
            }
        });
        Apr13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/13";
                dateView();
            }
        });
        Apr14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/14";
                dateView();
            }
        });
        Apr15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/15";
                dateView();
            }
        });
        Apr16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/16";
                dateView();
            }
        });
        Apr17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/17";
                dateView();
            }
        });
        Apr18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/18";
                dateView();
            }
        });
        Apr19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/19";
                dateView();
            }
        });
        Apr20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/20";
                dateView();
            }
        });
        Apr21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/21";
                dateView();
            }
        });
        Apr22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/22";
                dateView();
            }
        });
        Apr23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/23";
                dateView();
            }
        });
        Apr24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/24";
                dateView();
            }
        });
        Apr25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/25";
                dateView();
            }
        });
        Apr26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/26";
                dateView();
            }
        });
        Apr27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/27";
                dateView();
            }
        });
        Apr28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/28";
                dateView();
            }
        });
        Apr29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/29";
                dateView();
            }
        });
        Apr30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "4/30";
                dateView();
            }
        });
        May1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/1";
                dateView();
            }
        });
        May2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/2";
                dateView();
            }
        });
        May3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/3";
                dateView();
            }
        });
        May4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/4";
                dateView();
            }
        });
        May5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/5";
                dateView();
            }
        });
        May6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/6";
                dateView();
            }
        });
        May7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/7";
                dateView();
            }
        });
        May8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/8";
                dateView();
            }
        });
        May9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/9";
                dateView();
            }
        });
        May10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/10";
                dateView();
            }
        });
        May11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/11";
                dateView();
            }
        });
        May12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/12";
                dateView();
            }
        });
        May13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/13";
                dateView();
            }
        });
        May14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/14";
                dateView();
            }
        });
        May15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/15";
                dateView();
            }
        });
        May16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/16";
                dateView();
            }
        });
        May17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/17";
                dateView();
            }
        });
        May18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/18";
                dateView();
            }
        });
        May19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/19";
                dateView();
            }
        });
        May20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/20";
                dateView();
            }
        });
        May21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/21";
                dateView();
            }
        });
        May22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/22";
                dateView();
            }
        });
        May23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/23";
                dateView();
            }
        });
        May24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/24";
                dateView();
            }
        });
        May25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/25";
                dateView();
            }
        });
        May26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/26";
                dateView();
            }
        });
        May27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/27";
                dateView();
            }
        });
        May28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/28";
                dateView();
            }
        });
        May29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/29";
                dateView();
            }
        });
        May30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/30";
                dateView();
            }
        });
        May31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "5/31";
                dateView();
            }
        });
        Jun1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/1";
                dateView();
            }
        });
        Jun2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/2";
                dateView();
            }
        });
        Jun3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/3";
                dateView();
            }
        });
        Jun4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/4";
                dateView();
            }
        });
        Jun5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/5";
                dateView();
            }
        });
        Jun6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/6";
                dateView();
            }
        });
        Jun7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/7";
                dateView();
            }
        });
        Jun8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/8";
                dateView();
            }
        });
        Jun9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/9";
                dateView();
            }
        });
        Jun10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/10";
                dateView();
            }
        });
        Jun11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/11";
                dateView();
            }
        });
        Jun12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/12";
                dateView();
            }
        });
        Jun13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/13";
                dateView();
            }
        });
        Jun14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/14";
                dateView();
            }
        });
        Jun15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/15";
                dateView();
            }
        });
        Jun16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/16";
                dateView();
            }
        });
        Jun17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/17";
                dateView();
            }
        });
        Jun18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/18";
                dateView();
            }
        });
        Jun19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/19";
                dateView();
            }
        });
        Jun20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/20";
                dateView();
            }
        });
        Jun21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/21";
                dateView();
            }
        });
        Jun22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/22";
                dateView();
            }
        });
        Jun23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/23";
                dateView();
            }
        });
        Jun24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/24";
                dateView();
            }
        });
        Jun25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/25";
                dateView();
            }
        });
        Jun26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/26";
                dateView();
            }
        });
        Jun27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/27";
                dateView();
            }
        });
        Jun28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/28";
                dateView();
            }
        });
        Jun29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/29";
                dateView();
            }
        });
        Jun30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "6/30";
                dateView();
            }
        });
        Jul1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/1";
                dateView();
            }
        });
        Jul2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/2";
                dateView();
            }
        });
        Jul3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/3";
                dateView();
            }
        });
        Jul4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/4";
                dateView();
            }
        });
        Jul5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/5";
                dateView();
            }
        });
        Jul6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/6";
                dateView();
            }
        });
        Jul7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/7";
                dateView();
            }
        });
        Jul8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/8";
                dateView();
            }
        });
        Jul9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/9";
                dateView();
            }
        });
        Jul10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/10";
                dateView();
            }
        });
        Jul11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/11";
                dateView();
            }
        });
        Jul12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/12";
                dateView();
            }
        });
        Jul13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/13";
                dateView();
            }
        });
        Jul14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/14";
                dateView();
            }
        });
        Jul15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/15";
                dateView();
            }
        });
        Jul16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/16";
                dateView();
            }
        });
        Jul17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/17";
                dateView();
            }
        });
        Jul18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/18";
                dateView();
            }
        });
        Jul19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/19";
                dateView();
            }
        });
        Jul20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/20";
                dateView();
            }
        });
        Jul21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/21";
                dateView();
            }
        });
        Jul22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/22";
                dateView();
            }
        });
        Jul23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/23";
                dateView();
            }
        });
        Jul24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/24";
                dateView();
            }
        });
        Jul25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/25";
                dateView();
            }
        });
        Jul26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/26";
                dateView();
            }
        });
        Jul27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/27";
                dateView();
            }
        });
        Jul28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/28";
                dateView();
            }
        });
        Jul29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/29";
                dateView();
            }
        });
        Jul30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/30";
                dateView();
            }
        });
        Jul31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "7/31";
                dateView();
            }
        });
        Aug1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/1";
                dateView();
            }
        });
        Aug2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/2";
                dateView();
            }
        });
        Aug3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/3";
                dateView();
            }
        });
        Aug4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/4";
                dateView();
            }
        });
        Aug5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/5";
                dateView();
            }
        });
        Aug6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/6";
                dateView();
            }
        });
        Aug7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/7";
                dateView();
            }
        });
        Aug8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/8";
                dateView();
            }
        });
        Aug9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/9";
                dateView();
            }
        });
        Aug10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/10";
                dateView();
            }
        });
        Aug11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/11";
                dateView();
            }
        });
        Aug12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/12";
                dateView();
            }
        });
        Aug13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/13";
                dateView();
            }
        });
        Aug14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/14";
                dateView();
            }
        });
        Aug15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/15";
                dateView();
            }
        });
        Aug16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/16";
                dateView();
            }
        });
        Aug17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/17";
                dateView();
            }
        });
        Aug18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/18";
                dateView();
            }
        });
        Aug19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/19";
                dateView();
            }
        });
        Aug20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/20";
                dateView();
            }
        });
        Aug21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/21";
                dateView();
            }
        });
        Aug22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/22";
                dateView();
            }
        });
        Aug23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/23";
                dateView();
            }
        });
        Aug24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/24";
                dateView();
            }
        });
        Aug25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/25";
                dateView();
            }
        });
        Aug26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/26";
                dateView();
            }
        });
        Aug27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/27";
                dateView();
            }
        });
        Aug28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/28";
                dateView();
            }
        });
        Aug29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/29";
                dateView();
            }
        });
        Aug30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/30";
                dateView();
            }
        });
        Aug31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "8/31";
                dateView();
            }
        });
        Sep1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/1";
                dateView();
            }
        });
        Sep2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/2";
                dateView();
            }
        });
        Sep3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/3";
                dateView();
            }
        });
        Sep4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/4";
                dateView();
            }
        });
        Sep5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/5";
                dateView();
            }
        });
        Sep6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/6";
                dateView();
            }
        });
        Sep7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/7";
                dateView();
            }
        });
        Sep8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/8";
                dateView();
            }
        });
        Sep9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/9";
                dateView();
            }
        });
        Sep10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/10";
                dateView();
            }
        });
        Sep11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/11";
                dateView();
            }
        });
        Sep12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/12";
                dateView();
            }
        });
        Sep13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/13";
                dateView();
            }
        });
        Sep14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/14";
                dateView();
            }
        });
        Sep15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/15";
                dateView();
            }
        });
        Sep16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/16";
                dateView();
            }
        });
        Sep17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/17";
                dateView();
            }
        });
        Sep18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/18";
                dateView();
            }
        });
        Sep19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/19";
                dateView();
            }
        });
        Sep20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/20";
                dateView();
            }
        });
        Sep21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/21";
                dateView();
            }
        });
        Sep22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/22";
                dateView();
            }
        });
        Sep23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/23";
                dateView();
            }
        });
        Sep24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/24";
                dateView();
            }
        });
        Sep25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/25";
                dateView();
            }
        });
        Sep26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/26";
                dateView();
            }
        });
        Sep27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/27";
                dateView();
            }
        });
        Sep28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/28";
                dateView();
            }
        });
        Sep29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/29";
                dateView();
            }
        });
        Sep30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "9/30";
                dateView();
            }
        });
        Oct1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/1";
                dateView();
            }
        });
        Oct2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/2";
                dateView();
            }
        });
        Oct3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/3";
                dateView();
            }
        });
        Oct4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/4";
                dateView();
            }
        });
        Oct5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/5";
                dateView();
            }
        });
        Oct6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/6";
                dateView();
            }
        });
        Oct7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/7";
                dateView();
            }
        });
        Oct8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/8";
                dateView();
            }
        });
        Oct9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/9";
                dateView();
            }
        });
        Oct10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/10";
                dateView();
            }
        });
        Oct11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/11";
                dateView();
            }
        });
        Oct12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/12";
                dateView();
            }
        });
        Oct13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/13";
                dateView();
            }
        });
        Oct14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/14";
                dateView();
            }
        });
        Oct15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/15";
                dateView();
            }
        });
        Oct16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/16";
                dateView();
            }
        });
        Oct17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/17";
                dateView();
            }
        });
        Oct18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/18";
                dateView();
            }
        });
        Oct19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/19";
                dateView();
            }
        });
        Oct20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/20";
                dateView();
            }
        });
        Oct21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/21";
                dateView();
            }
        });
        Oct22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/22";
                dateView();
            }
        });
        Oct23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/23";
                dateView();
            }
        });
        Oct24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/24";
                dateView();
            }
        });
        Oct25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/25";
                dateView();
            }
        });
        Oct26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/26";
                dateView();
            }
        });
        Oct27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/27";
                dateView();
            }
        });
        Oct28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/28";
                dateView();
            }
        });
        Oct29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/29";
                dateView();
            }
        });
        Oct30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/30";
                dateView();
            }
        });
        Oct31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "10/31";
                dateView();
            }
        });
        Nov1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/1";
                dateView();
            }
        });
        Nov2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/2";
                dateView();
            }
        });
        Nov3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/3";
                dateView();
            }
        });
        Nov4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/4";
                dateView();
            }
        });
        Nov5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/5";
                dateView();
            }
        });
        Nov6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/6";
                dateView();
            }
        });
        Nov7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/7";
                dateView();
            }
        });
        Nov8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/8";
                dateView();
            }
        });
        Nov9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/9";
                dateView();
            }
        });
        Nov10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/10";
                dateView();
            }
        });
        Nov11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/11";
                dateView();
            }
        });
        Nov12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/12";
                dateView();
            }
        });
        Nov13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/13";
                dateView();
            }
        });
        Nov14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/14";
                dateView();
            }
        });
        Nov15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/15";
                dateView();
            }
        });
        Nov16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/16";
                dateView();
            }
        });
        Nov17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/17";
                dateView();
            }
        });
        Nov18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/18";
                dateView();
            }
        });
        Nov19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/19";
                dateView();
            }
        });
        Nov20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/20";
                dateView();
            }
        });
        Nov21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/21";
                dateView();
            }
        });
        Nov22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/22";
                dateView();
            }
        });
        Nov23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/23";
                dateView();
            }
        });
        Nov24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/24";
                dateView();
            }
        });
        Nov25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/25";
                dateView();
            }
        });
        Nov26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/26";
                dateView();
            }
        });
        Nov27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/27";
                dateView();
            }
        });
        Nov28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/28";
                dateView();
            }
        });
        Nov29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/29";
                dateView();
            }
        });
        Nov30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "11/30";
                dateView();
            }
        });
        Dec1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/1";
                dateView();
            }
        });
        Dec2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/2";
                dateView();
            }
        });
        Dec3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/3";
                dateView();
            }
        });
        Dec4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/4";
                dateView();
            }
        });
        Dec5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/5";
                dateView();
            }
        });
        Dec6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/6";
                dateView();
            }
        });
        Dec7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/7";
                dateView();
            }
        });
        Dec8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/8";
                dateView();
            }
        });
        Dec9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/9";
                dateView();
            }
        });
        Dec10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/10";
                dateView();
            }
        });
        Dec11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/11";
                dateView();
            }
        });
        Dec12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/12";
                dateView();
            }
        });
        Dec13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/13";
                dateView();
            }
        });
        Dec14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/14";
                dateView();
            }
        });
        Dec15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/15";
                dateView();
            }
        });
        Dec16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/16";
                dateView();
            }
        });
        Dec17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/17";
                dateView();
            }
        });
        Dec18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/18";
                dateView();
            }
        });
        Dec19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/19";
                dateView();
            }
        });
        Dec20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/20";
                dateView();
            }
        });
        Dec21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/21";
                dateView();
            }
        });
        Dec22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/22";
                dateView();
            }
        });
        Dec23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/23";
                dateView();
            }
        });
        Dec24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/24";
                dateView();
            }
        });
        Dec25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/25";
                dateView();
            }
        });
        Dec26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/26";
                dateView();
            }
        });
        Dec27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/27";
                dateView();
            }
        });
        Dec28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/28";
                dateView();
            }
        });
        Dec29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/29";
                dateView();
            }
        });
        Dec30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/30";
                dateView();
            }
        });
        Dec31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                currentDateSelection = "12/31";
                dateView();
            }
        });

        readDatabase();


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

        submitScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (workoutSwitch.getText().toString() == "Switch to CrossFit"){
                    startActivity(new Intent(LegendsHome.this, LegendsBootcampWODResults.class));
                } else {
                    startActivity(new Intent(LegendsHome.this, LegendsCrossfitWODResults.class));
                }
            }
        });

        workoutSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (workoutSwitch.getText().toString() == "Switch to Bootcamp"){
                    workoutSwitch.setText("Switch to CrossFit");
                    bootCamp = "true";
                    readDatabase();
                } else{
                    workoutSwitch.setText("Switch to Bootcamp");
                    bootCamp = "false";
                    readDatabase();
                }
            }
        });


    }

    private final void focusOnView(final TextView useDate){
        dateScroll.post(new Runnable() {
            @Override
            public void run() {
                dateScroll.scrollTo(useDate.getLeft(), 0);
            }
        });
    }

    private final void readDatabase(){

        mDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                showData(dataSnapshot);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void showData(DataSnapshot dataSnapshot){
        for(DataSnapshot ds : dataSnapshot.getChildren()){
            WODWorkout wod = new WODWorkout();
            wodTest.setText(wod.getDescription());

            switch (bootCamp) {
                case "true":
                    switch (currentDateSelection) {
                        case "1/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jan31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Feb29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Mar31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Apr30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("May31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jun30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/11":;
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Jul31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Aug31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Sep30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Oct31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Nov30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/1":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/2":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/3":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/4":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/5":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/6":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/7":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/8":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/9":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/10":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/11":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/12":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/13":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/14":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/15":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/16":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/17":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/18":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/19":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/20":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/21":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/22":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/23":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/24":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/25":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/26":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/27":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/28":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/29":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/30":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/31":
                            wod.setDescription(ds.child("wodPage").child("bootcamp").child("Dec31").getValue(WODWorkout.class).getDescription());
                            break;
                        default:
                            wodTest.setText("Error");
                            break;
                    }
                    break;
                case "false":
                    switch (currentDateSelection) {
                        case "1/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "1/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jan31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "2/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Feb29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "3/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Mar31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "4/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Apr30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "5/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("May31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "6/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jun30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/11":;
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "7/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Jul31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "8/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Aug31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "9/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Sep30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "10/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Oct31").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "11/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Nov30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/1":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec1").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/2":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec2").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/3":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec3").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/4":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec4").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/5":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec5").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/6":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec6").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/7":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec7").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/8":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec8").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/9":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec9").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/10":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec10").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/11":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec11").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/12":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec12").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/13":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec13").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/14":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec14").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/15":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec15").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/16":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec16").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/17":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec17").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/18":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec18").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/19":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec19").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/20":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec20").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/21":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec21").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/22":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec22").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/23":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec23").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/24":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec24").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/25":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec25").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/26":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec26").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/27":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec27").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/28":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec28").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/29":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec29").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/30":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec30").getValue(WODWorkout.class).getDescription());
                            break;
                        case "12/31":
                            wod.setDescription(ds.child("wodPage").child("crossfit").child("Dec31").getValue(WODWorkout.class).getDescription());
                            break;
                        default:
                            wodTest.setText("Error");
                            break;
                    }
                    break;
                default:
                    break;
            }
            wodTest.setText(wod.getDescription());
        }
    }

    private void dateView(){

        /* Reset all backgrounds to black */
        Jan1.setBackgroundResource(R.color.black);
        Jan2.setBackgroundResource(R.color.black);
        Jan3.setBackgroundResource(R.color.black);
        Jan4.setBackgroundResource(R.color.black);
        Jan5.setBackgroundResource(R.color.black);
        Jan6.setBackgroundResource(R.color.black);
        Jan7.setBackgroundResource(R.color.black);
        Jan8.setBackgroundResource(R.color.black);
        Jan9.setBackgroundResource(R.color.black);
        Jan10.setBackgroundResource(R.color.black);
        Jan11.setBackgroundResource(R.color.black);
        Jan12.setBackgroundResource(R.color.black);
        Jan13.setBackgroundResource(R.color.black);
        Jan14.setBackgroundResource(R.color.black);
        Jan15.setBackgroundResource(R.color.black);
        Jan16.setBackgroundResource(R.color.black);
        Jan17.setBackgroundResource(R.color.black);
        Jan18.setBackgroundResource(R.color.black);
        Jan19.setBackgroundResource(R.color.black);
        Jan20.setBackgroundResource(R.color.black);
        Jan21.setBackgroundResource(R.color.black);
        Jan22.setBackgroundResource(R.color.black);
        Jan23.setBackgroundResource(R.color.black);
        Jan24.setBackgroundResource(R.color.black);
        Jan25.setBackgroundResource(R.color.black);
        Jan26.setBackgroundResource(R.color.black);
        Jan27.setBackgroundResource(R.color.black);
        Jan28.setBackgroundResource(R.color.black);
        Jan29.setBackgroundResource(R.color.black);
        Jan30.setBackgroundResource(R.color.black);
        Jan31.setBackgroundResource(R.color.black);
        Feb1.setBackgroundResource(R.color.black);
        Feb2.setBackgroundResource(R.color.black);
        Feb3.setBackgroundResource(R.color.black);
        Feb4.setBackgroundResource(R.color.black);
        Feb5.setBackgroundResource(R.color.black);
        Feb6.setBackgroundResource(R.color.black);
        Feb7.setBackgroundResource(R.color.black);
        Feb8.setBackgroundResource(R.color.black);
        Feb9.setBackgroundResource(R.color.black);
        Feb10.setBackgroundResource(R.color.black);
        Feb11.setBackgroundResource(R.color.black);
        Feb12.setBackgroundResource(R.color.black);
        Feb13.setBackgroundResource(R.color.black);
        Feb14.setBackgroundResource(R.color.black);
        Feb15.setBackgroundResource(R.color.black);
        Feb16.setBackgroundResource(R.color.black);
        Feb17.setBackgroundResource(R.color.black);
        Feb18.setBackgroundResource(R.color.black);
        Feb19.setBackgroundResource(R.color.black);
        Feb20.setBackgroundResource(R.color.black);
        Feb21.setBackgroundResource(R.color.black);
        Feb22.setBackgroundResource(R.color.black);
        Feb23.setBackgroundResource(R.color.black);
        Feb24.setBackgroundResource(R.color.black);
        Feb25.setBackgroundResource(R.color.black);
        Feb26.setBackgroundResource(R.color.black);
        Feb27.setBackgroundResource(R.color.black);
        Feb28.setBackgroundResource(R.color.black);
        Feb29.setBackgroundResource(R.color.black);
        Mar1.setBackgroundResource(R.color.black);
        Mar2.setBackgroundResource(R.color.black);
        Mar3.setBackgroundResource(R.color.black);
        Mar4.setBackgroundResource(R.color.black);
        Mar5.setBackgroundResource(R.color.black);
        Mar6.setBackgroundResource(R.color.black);
        Mar7.setBackgroundResource(R.color.black);
        Mar8.setBackgroundResource(R.color.black);
        Mar9.setBackgroundResource(R.color.black);
        Mar10.setBackgroundResource(R.color.black);
        Mar11.setBackgroundResource(R.color.black);
        Mar12.setBackgroundResource(R.color.black);
        Mar13.setBackgroundResource(R.color.black);
        Mar14.setBackgroundResource(R.color.black);
        Mar15.setBackgroundResource(R.color.black);
        Mar16.setBackgroundResource(R.color.black);
        Mar17.setBackgroundResource(R.color.black);
        Mar18.setBackgroundResource(R.color.black);
        Mar19.setBackgroundResource(R.color.black);
        Mar20.setBackgroundResource(R.color.black);
        Mar21.setBackgroundResource(R.color.black);
        Mar22.setBackgroundResource(R.color.black);
        Mar23.setBackgroundResource(R.color.black);
        Mar24.setBackgroundResource(R.color.black);
        Mar25.setBackgroundResource(R.color.black);
        Mar26.setBackgroundResource(R.color.black);
        Mar27.setBackgroundResource(R.color.black);
        Mar28.setBackgroundResource(R.color.black);
        Mar29.setBackgroundResource(R.color.black);
        Mar30.setBackgroundResource(R.color.black);
        Mar31.setBackgroundResource(R.color.black);
        Apr1.setBackgroundResource(R.color.black);
        Apr2.setBackgroundResource(R.color.black);
        Apr3.setBackgroundResource(R.color.black);
        Apr4.setBackgroundResource(R.color.black);
        Apr5.setBackgroundResource(R.color.black);
        Apr6.setBackgroundResource(R.color.black);
        Apr7.setBackgroundResource(R.color.black);
        Apr8.setBackgroundResource(R.color.black);
        Apr9.setBackgroundResource(R.color.black);
        Apr10.setBackgroundResource(R.color.black);
        Apr11.setBackgroundResource(R.color.black);
        Apr12.setBackgroundResource(R.color.black);
        Apr13.setBackgroundResource(R.color.black);
        Apr14.setBackgroundResource(R.color.black);
        Apr15.setBackgroundResource(R.color.black);
        Apr16.setBackgroundResource(R.color.black);
        Apr17.setBackgroundResource(R.color.black);
        Apr18.setBackgroundResource(R.color.black);
        Apr19.setBackgroundResource(R.color.black);
        Apr20.setBackgroundResource(R.color.black);
        Apr21.setBackgroundResource(R.color.black);
        Apr22.setBackgroundResource(R.color.black);
        Apr23.setBackgroundResource(R.color.black);
        Apr24.setBackgroundResource(R.color.black);
        Apr25.setBackgroundResource(R.color.black);
        Apr26.setBackgroundResource(R.color.black);
        Apr27.setBackgroundResource(R.color.black);
        Apr28.setBackgroundResource(R.color.black);
        Apr29.setBackgroundResource(R.color.black);
        Apr30.setBackgroundResource(R.color.black);
        May1.setBackgroundResource(R.color.black);
        May2.setBackgroundResource(R.color.black);
        May3.setBackgroundResource(R.color.black);
        May4.setBackgroundResource(R.color.black);
        May5.setBackgroundResource(R.color.black);
        May6.setBackgroundResource(R.color.black);
        May7.setBackgroundResource(R.color.black);
        May8.setBackgroundResource(R.color.black);
        May9.setBackgroundResource(R.color.black);
        May10.setBackgroundResource(R.color.black);
        May11.setBackgroundResource(R.color.black);
        May12.setBackgroundResource(R.color.black);
        May13.setBackgroundResource(R.color.black);
        May14.setBackgroundResource(R.color.black);
        May15.setBackgroundResource(R.color.black);
        May16.setBackgroundResource(R.color.black);
        May17.setBackgroundResource(R.color.black);
        May18.setBackgroundResource(R.color.black);
        May19.setBackgroundResource(R.color.black);
        May20.setBackgroundResource(R.color.black);
        May21.setBackgroundResource(R.color.black);
        May22.setBackgroundResource(R.color.black);
        May23.setBackgroundResource(R.color.black);
        May24.setBackgroundResource(R.color.black);
        May25.setBackgroundResource(R.color.black);
        May26.setBackgroundResource(R.color.black);
        May27.setBackgroundResource(R.color.black);
        May28.setBackgroundResource(R.color.black);
        May29.setBackgroundResource(R.color.black);
        May30.setBackgroundResource(R.color.black);
        May31.setBackgroundResource(R.color.black);
        Jun1.setBackgroundResource(R.color.black);
        Jun2.setBackgroundResource(R.color.black);
        Jun3.setBackgroundResource(R.color.black);
        Jun4.setBackgroundResource(R.color.black);
        Jun5.setBackgroundResource(R.color.black);
        Jun6.setBackgroundResource(R.color.black);
        Jun7.setBackgroundResource(R.color.black);
        Jun8.setBackgroundResource(R.color.black);
        Jun9.setBackgroundResource(R.color.black);
        Jun10.setBackgroundResource(R.color.black);
        Jun11.setBackgroundResource(R.color.black);
        Jun12.setBackgroundResource(R.color.black);
        Jun13.setBackgroundResource(R.color.black);
        Jun14.setBackgroundResource(R.color.black);
        Jun15.setBackgroundResource(R.color.black);
        Jun16.setBackgroundResource(R.color.black);
        Jun17.setBackgroundResource(R.color.black);
        Jun18.setBackgroundResource(R.color.black);
        Jun19.setBackgroundResource(R.color.black);
        Jun20.setBackgroundResource(R.color.black);
        Jun21.setBackgroundResource(R.color.black);
        Jun22.setBackgroundResource(R.color.black);
        Jun23.setBackgroundResource(R.color.black);
        Jun24.setBackgroundResource(R.color.black);
        Jun25.setBackgroundResource(R.color.black);
        Jun26.setBackgroundResource(R.color.black);
        Jun27.setBackgroundResource(R.color.black);
        Jun28.setBackgroundResource(R.color.black);
        Jun29.setBackgroundResource(R.color.black);
        Jun30.setBackgroundResource(R.color.black);
        Jul1.setBackgroundResource(R.color.black);
        Jul2.setBackgroundResource(R.color.black);
        Jul3.setBackgroundResource(R.color.black);
        Jul4.setBackgroundResource(R.color.black);
        Jul5.setBackgroundResource(R.color.black);
        Jul6.setBackgroundResource(R.color.black);
        Jul7.setBackgroundResource(R.color.black);
        Jul8.setBackgroundResource(R.color.black);
        Jul9.setBackgroundResource(R.color.black);
        Jul10.setBackgroundResource(R.color.black);
        Jul11.setBackgroundResource(R.color.black);
        Jul12.setBackgroundResource(R.color.black);
        Jul13.setBackgroundResource(R.color.black);
        Jul14.setBackgroundResource(R.color.black);
        Jul15.setBackgroundResource(R.color.black);
        Jul16.setBackgroundResource(R.color.black);
        Jul17.setBackgroundResource(R.color.black);
        Jul18.setBackgroundResource(R.color.black);
        Jul19.setBackgroundResource(R.color.black);
        Jul20.setBackgroundResource(R.color.black);
        Jul21.setBackgroundResource(R.color.black);
        Jul22.setBackgroundResource(R.color.black);
        Jul23.setBackgroundResource(R.color.black);
        Jul24.setBackgroundResource(R.color.black);
        Jul25.setBackgroundResource(R.color.black);
        Jul26.setBackgroundResource(R.color.black);
        Jul27.setBackgroundResource(R.color.black);
        Jul28.setBackgroundResource(R.color.black);
        Jul29.setBackgroundResource(R.color.black);
        Jul30.setBackgroundResource(R.color.black);
        Jul31.setBackgroundResource(R.color.black);
        Aug1.setBackgroundResource(R.color.black);
        Aug2.setBackgroundResource(R.color.black);
        Aug3.setBackgroundResource(R.color.black);
        Aug4.setBackgroundResource(R.color.black);
        Aug5.setBackgroundResource(R.color.black);
        Aug6.setBackgroundResource(R.color.black);
        Aug7.setBackgroundResource(R.color.black);
        Aug8.setBackgroundResource(R.color.black);
        Aug9.setBackgroundResource(R.color.black);
        Aug10.setBackgroundResource(R.color.black);
        Aug11.setBackgroundResource(R.color.black);
        Aug12.setBackgroundResource(R.color.black);
        Aug13.setBackgroundResource(R.color.black);
        Aug14.setBackgroundResource(R.color.black);
        Aug15.setBackgroundResource(R.color.black);
        Aug16.setBackgroundResource(R.color.black);
        Aug17.setBackgroundResource(R.color.black);
        Aug18.setBackgroundResource(R.color.black);
        Aug19.setBackgroundResource(R.color.black);
        Aug20.setBackgroundResource(R.color.black);
        Aug21.setBackgroundResource(R.color.black);
        Aug22.setBackgroundResource(R.color.black);
        Aug23.setBackgroundResource(R.color.black);
        Aug24.setBackgroundResource(R.color.black);
        Aug25.setBackgroundResource(R.color.black);
        Aug26.setBackgroundResource(R.color.black);
        Aug27.setBackgroundResource(R.color.black);
        Aug28.setBackgroundResource(R.color.black);
        Aug29.setBackgroundResource(R.color.black);
        Aug30.setBackgroundResource(R.color.black);
        Aug31.setBackgroundResource(R.color.black);
        Sep1.setBackgroundResource(R.color.black);
        Sep2.setBackgroundResource(R.color.black);
        Sep3.setBackgroundResource(R.color.black);
        Sep4.setBackgroundResource(R.color.black);
        Sep5.setBackgroundResource(R.color.black);
        Sep6.setBackgroundResource(R.color.black);
        Sep7.setBackgroundResource(R.color.black);
        Sep8.setBackgroundResource(R.color.black);
        Sep9.setBackgroundResource(R.color.black);
        Sep10.setBackgroundResource(R.color.black);
        Sep11.setBackgroundResource(R.color.black);
        Sep12.setBackgroundResource(R.color.black);
        Sep13.setBackgroundResource(R.color.black);
        Sep14.setBackgroundResource(R.color.black);
        Sep15.setBackgroundResource(R.color.black);
        Sep16.setBackgroundResource(R.color.black);
        Sep17.setBackgroundResource(R.color.black);
        Sep18.setBackgroundResource(R.color.black);
        Sep19.setBackgroundResource(R.color.black);
        Sep20.setBackgroundResource(R.color.black);
        Sep21.setBackgroundResource(R.color.black);
        Sep22.setBackgroundResource(R.color.black);
        Sep23.setBackgroundResource(R.color.black);
        Sep24.setBackgroundResource(R.color.black);
        Sep25.setBackgroundResource(R.color.black);
        Sep26.setBackgroundResource(R.color.black);
        Sep27.setBackgroundResource(R.color.black);
        Sep28.setBackgroundResource(R.color.black);
        Sep29.setBackgroundResource(R.color.black);
        Sep30.setBackgroundResource(R.color.black);
        Oct1.setBackgroundResource(R.color.black);
        Oct2.setBackgroundResource(R.color.black);
        Oct3.setBackgroundResource(R.color.black);
        Oct4.setBackgroundResource(R.color.black);
        Oct5.setBackgroundResource(R.color.black);
        Oct6.setBackgroundResource(R.color.black);
        Oct7.setBackgroundResource(R.color.black);
        Oct8.setBackgroundResource(R.color.black);
        Oct9.setBackgroundResource(R.color.black);
        Oct10.setBackgroundResource(R.color.black);
        Oct11.setBackgroundResource(R.color.black);
        Oct12.setBackgroundResource(R.color.black);
        Oct13.setBackgroundResource(R.color.black);
        Oct14.setBackgroundResource(R.color.black);
        Oct15.setBackgroundResource(R.color.black);
        Oct16.setBackgroundResource(R.color.black);
        Oct17.setBackgroundResource(R.color.black);
        Oct18.setBackgroundResource(R.color.black);
        Oct19.setBackgroundResource(R.color.black);
        Oct20.setBackgroundResource(R.color.black);
        Oct21.setBackgroundResource(R.color.black);
        Oct22.setBackgroundResource(R.color.black);
        Oct23.setBackgroundResource(R.color.black);
        Oct24.setBackgroundResource(R.color.black);
        Oct25.setBackgroundResource(R.color.black);
        Oct26.setBackgroundResource(R.color.black);
        Oct27.setBackgroundResource(R.color.black);
        Oct28.setBackgroundResource(R.color.black);
        Oct29.setBackgroundResource(R.color.black);
        Oct30.setBackgroundResource(R.color.black);
        Oct31.setBackgroundResource(R.color.black);
        Nov1.setBackgroundResource(R.color.black);
        Nov2.setBackgroundResource(R.color.black);
        Nov3.setBackgroundResource(R.color.black);
        Nov4.setBackgroundResource(R.color.black);
        Nov5.setBackgroundResource(R.color.black);
        Nov6.setBackgroundResource(R.color.black);
        Nov7.setBackgroundResource(R.color.black);
        Nov8.setBackgroundResource(R.color.black);
        Nov9.setBackgroundResource(R.color.black);
        Nov10.setBackgroundResource(R.color.black);
        Nov11.setBackgroundResource(R.color.black);
        Nov12.setBackgroundResource(R.color.black);
        Nov13.setBackgroundResource(R.color.black);
        Nov14.setBackgroundResource(R.color.black);
        Nov15.setBackgroundResource(R.color.black);
        Nov16.setBackgroundResource(R.color.black);
        Nov17.setBackgroundResource(R.color.black);
        Nov18.setBackgroundResource(R.color.black);
        Nov19.setBackgroundResource(R.color.black);
        Nov20.setBackgroundResource(R.color.black);
        Nov21.setBackgroundResource(R.color.black);
        Nov22.setBackgroundResource(R.color.black);
        Nov23.setBackgroundResource(R.color.black);
        Nov24.setBackgroundResource(R.color.black);
        Nov25.setBackgroundResource(R.color.black);
        Nov26.setBackgroundResource(R.color.black);
        Nov27.setBackgroundResource(R.color.black);
        Nov28.setBackgroundResource(R.color.black);
        Nov29.setBackgroundResource(R.color.black);
        Nov30.setBackgroundResource(R.color.black);
        Dec1.setBackgroundResource(R.color.black);
        Dec2.setBackgroundResource(R.color.black);
        Dec3.setBackgroundResource(R.color.black);
        Dec4.setBackgroundResource(R.color.black);
        Dec5.setBackgroundResource(R.color.black);
        Dec6.setBackgroundResource(R.color.black);
        Dec7.setBackgroundResource(R.color.black);
        Dec8.setBackgroundResource(R.color.black);
        Dec9.setBackgroundResource(R.color.black);
        Dec10.setBackgroundResource(R.color.black);
        Dec11.setBackgroundResource(R.color.black);
        Dec12.setBackgroundResource(R.color.black);
        Dec13.setBackgroundResource(R.color.black);
        Dec14.setBackgroundResource(R.color.black);
        Dec15.setBackgroundResource(R.color.black);
        Dec16.setBackgroundResource(R.color.black);
        Dec17.setBackgroundResource(R.color.black);
        Dec18.setBackgroundResource(R.color.black);
        Dec19.setBackgroundResource(R.color.black);
        Dec20.setBackgroundResource(R.color.black);
        Dec21.setBackgroundResource(R.color.black);
        Dec22.setBackgroundResource(R.color.black);
        Dec23.setBackgroundResource(R.color.black);
        Dec24.setBackgroundResource(R.color.black);
        Dec25.setBackgroundResource(R.color.black);
        Dec26.setBackgroundResource(R.color.black);
        Dec27.setBackgroundResource(R.color.black);
        Dec28.setBackgroundResource(R.color.black);
        Dec29.setBackgroundResource(R.color.black);
        Dec30.setBackgroundResource(R.color.black);
        Dec31.setBackgroundResource(R.color.black);

        /* Sets active date */
        switch (currentDateSelection) {
            case "1/1":
                Jan1.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan1);
                readDatabase();
                break;
            case "1/2":
                Jan2.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan1);
                break;
            case "1/3":
                Jan3.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan1);
                break;
            case "1/4":
                Jan4.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan2);
                break;
            case "1/5":
                Jan5.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan3);
                break;
            case "1/6":
                Jan6.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan4);
                break;
            case "1/7":
                Jan7.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan5);
                break;
            case "1/8":
                Jan8.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan6);
                break;
            case "1/9":
                Jan9.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan7);
                break;
            case "1/10":
                Jan10.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan8);
                break;
            case "1/11":
                Jan11.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan9);
                break;
            case "1/12":
                Jan12.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan10);
                break;
            case "1/13":
                Jan13.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan11);
                break;
            case "1/14":
                Jan14.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan12);
                break;
            case "1/15":
                Jan15.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan13);
                break;
            case "1/16":
                Jan16.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan14);
                break;
            case "1/17":
                Jan17.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan15);
                break;
            case "1/18":
                Jan18.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan16);
                break;
            case "1/19":
                Jan19.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan17);
                break;
            case "1/20":
                Jan20.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan18);
                break;
            case "1/21":
                Jan21.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan19);
                break;
            case "1/22":
                Jan22.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan20);
                break;
            case "1/23":
                Jan23.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan21);
                break;
            case "1/24":
                Jan24.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan22);
                break;
            case "1/25":
                Jan25.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan23);
                break;
            case "1/26":
                Jan26.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan24);
                break;
            case "1/27":
                Jan27.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan25);
                break;
            case "1/28":
                Jan28.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan26);
                break;
            case "1/29":
                Jan29.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan27);
                break;
            case "1/30":
                Jan30.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan28);
                break;
            case "1/31":
                Jan31.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan29);
                break;
            case "2/1":
                Feb1.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan30);
                break;
            case "2/2":
                Feb2.setBackgroundResource(R.color.darkGray);
                focusOnView(Jan31);
                break;
            case "2/3":
                Feb3.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb1);
                break;
            case "2/4":
                Feb4.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb2);
                break;
            case "2/5":
                Feb5.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb3);
                break;
            case "2/6":
                Feb6.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb4);
                break;
            case "2/7":
                Feb7.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb5);
                break;
            case "2/8":
                Feb8.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb6);
                break;
            case "2/9":
                Feb9.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb7);
                break;
            case "2/10":
                Feb10.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb8);
                break;
            case "2/11":
                Feb11.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb9);
                break;
            case "2/12":
                Feb12.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb10);
                break;
            case "2/13":
                Feb13.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb11);
                break;
            case "2/14":
                Feb14.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb12);
                break;
            case "2/15":
                Feb15.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb13);
                break;
            case "2/16":
                Feb16.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb14);
                break;
            case "2/17":
                Feb17.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb15);
                break;
            case "2/18":
                Feb18.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb16);
                break;
            case "2/19":
                Feb19.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb17);
                break;
            case "2/20":
                Feb20.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb18);
                break;
            case "2/21":
                Feb21.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb19);
                break;
            case "2/22":
                Feb22.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb20);
                break;
            case "2/23":
                Feb23.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb21);
                break;
            case "2/24":
                Feb24.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb22);
                break;
            case "2/25":
                Feb25.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb23);
                break;
            case "2/26":
                Feb26.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb24);
                break;
            case "2/27":
                Feb27.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb25);
                break;
            case "2/28":
                Feb28.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb26);
                break;
            case "2/29":
                Feb29.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb27);
                break;
            case "3/1":
                Mar1.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb28);
                break;
            case "3/2":
                Mar2.setBackgroundResource(R.color.darkGray);
                focusOnView(Feb29);
                break;
            case "3/3":
                Mar3.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar1);
                break;
            case "3/4":
                Mar4.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar2);
                break;
            case "3/5":
                Mar5.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar3);
                break;
            case "3/6":
                Mar6.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar4);
                break;
            case "3/7":
                Mar7.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar5);
                break;
            case "3/8":
                Mar8.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar6);
                break;
            case "3/9":
                Mar9.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar7);
                break;
            case "3/10":
                Mar10.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar8);
                break;
            case "3/11":
                Mar11.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar9);
                break;
            case "3/12":
                Mar12.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar10);
                break;
            case "3/13":
                Mar13.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar11);
                break;
            case "3/14":
                Mar14.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar12);
                break;
            case "3/15":
                Mar15.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar13);
                break;
            case "3/16":
                Mar16.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar14);
                break;
            case "3/17":
                Mar17.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar15);
                break;
            case "3/18":
                Mar18.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar16);
                break;
            case "3/19":
                Mar19.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar17);
                break;
            case "3/20":
                Mar20.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar18);
                break;
            case "3/21":
                Mar21.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar19);
                break;
            case "3/22":
                Mar22.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar20);
                break;
            case "3/23":
                Mar23.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar21);
                break;
            case "3/24":
                Mar24.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar22);
                break;
            case "3/25":
                Mar25.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar23);
                break;
            case "3/26":
                Mar26.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar24);
                break;
            case "3/27":
                Mar27.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar25);
                break;
            case "3/28":
                Mar28.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar26);
                break;
            case "3/29":
                Mar29.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar27);
                break;
            case "3/30":
                Mar30.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar28);
                break;
            case "3/31":
                Mar31.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar29);
                break;
            case "4/1":
                Apr1.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar30);
                break;
            case "4/2":
                Apr2.setBackgroundResource(R.color.darkGray);
                focusOnView(Mar31);
                break;
            case "4/3":
                Apr3.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr1);
                break;
            case "4/4":
                Apr4.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr2);
                break;
            case "4/5":
                Apr5.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr3);
                break;
            case "4/6":
                Apr6.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr4);
                break;
            case "4/7":
                Apr7.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr5);
                break;
            case "4/8":
                Apr8.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr6);
                break;
            case "4/9":
                Apr9.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr7);
                break;
            case "4/10":
                Apr10.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr8);
                break;
            case "4/11":
                Apr11.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr9);
                break;
            case "4/12":
                Apr12.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr10);
                break;
            case "4/13":
                Apr13.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr11);
                break;
            case "4/14":
                Apr14.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr12);
                break;
            case "4/15":
                Apr15.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr13);
                break;
            case "4/16":
                Apr16.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr14);
                break;
            case "4/17":
                Apr17.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr15);
                break;
            case "4/18":
                Apr18.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr16);
                break;
            case "4/19":
                Apr19.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr17);
                break;
            case "4/20":
                Apr20.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr18);
                break;
            case "4/21":
                Apr21.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr19);
                break;
            case "4/22":
                Apr22.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr20);
                break;
            case "4/23":
                Apr23.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr21);
                break;
            case "4/24":
                Apr24.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr22);
                break;
            case "4/25":
                Apr25.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr23);
                break;
            case "4/26":
                Apr26.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr24);
                break;
            case "4/27":
                Apr27.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr25);
                break;
            case "4/28":
                Apr28.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr26);
                break;
            case "4/29":
                Apr29.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr27);
                break;
            case "4/30":
                Apr30.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr28);
                break;
            case "5/1":
                May1.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr29);
                break;
            case "5/2":
                May2.setBackgroundResource(R.color.darkGray);
                focusOnView(Apr30);
                break;
            case "5/3":
                May3.setBackgroundResource(R.color.darkGray);
                focusOnView(May1);
                break;
            case "5/4":
                May4.setBackgroundResource(R.color.darkGray);
                focusOnView(May2);
                break;
            case "5/5":
                May5.setBackgroundResource(R.color.darkGray);
                focusOnView(May3);
                break;
            case "5/6":
                May6.setBackgroundResource(R.color.darkGray);
                focusOnView(May4);
                break;
            case "5/7":
                May7.setBackgroundResource(R.color.darkGray);
                focusOnView(May5);
                break;
            case "5/8":
                May8.setBackgroundResource(R.color.darkGray);
                focusOnView(May6);
                break;
            case "5/9":
                May9.setBackgroundResource(R.color.darkGray);
                focusOnView(May7);
                break;
            case "5/10":
                May10.setBackgroundResource(R.color.darkGray);
                focusOnView(May8);
                break;
            case "5/11":
                May11.setBackgroundResource(R.color.darkGray);
                focusOnView(May9);
                break;
            case "5/12":
                May12.setBackgroundResource(R.color.darkGray);
                focusOnView(May10);
                break;
            case "5/13":
                May13.setBackgroundResource(R.color.darkGray);
                focusOnView(May11);
                break;
            case "5/14":
                May14.setBackgroundResource(R.color.darkGray);
                focusOnView(May12);
                break;
            case "5/15":
                May15.setBackgroundResource(R.color.darkGray);
                focusOnView(May13);
                break;
            case "5/16":
                May16.setBackgroundResource(R.color.darkGray);
                focusOnView(May14);
                break;
            case "5/17":
                May17.setBackgroundResource(R.color.darkGray);
                focusOnView(May15);
                break;
            case "5/18":
                May18.setBackgroundResource(R.color.darkGray);
                focusOnView(May16);
                break;
            case "5/19":
                May19.setBackgroundResource(R.color.darkGray);
                focusOnView(May17);
                break;
            case "5/20":
                May20.setBackgroundResource(R.color.darkGray);
                focusOnView(May18);
                break;
            case "5/21":
                May21.setBackgroundResource(R.color.darkGray);
                focusOnView(May19);
                break;
            case "5/22":
                May22.setBackgroundResource(R.color.darkGray);
                focusOnView(May20);
                break;
            case "5/23":
                May23.setBackgroundResource(R.color.darkGray);
                focusOnView(May21);
                break;
            case "5/24":
                May24.setBackgroundResource(R.color.darkGray);
                focusOnView(May22);
                break;
            case "5/25":
                May25.setBackgroundResource(R.color.darkGray);
                focusOnView(May23);
                break;
            case "5/26":
                May26.setBackgroundResource(R.color.darkGray);
                focusOnView(May24);
                break;
            case "5/27":
                May27.setBackgroundResource(R.color.darkGray);
                focusOnView(May25);
                break;
            case "5/28":
                May28.setBackgroundResource(R.color.darkGray);
                focusOnView(May26);
                break;
            case "5/29":
                May29.setBackgroundResource(R.color.darkGray);
                focusOnView(May27);
                break;
            case "5/30":
                May30.setBackgroundResource(R.color.darkGray);
                focusOnView(May28);
                break;
            case "5/31":
                May31.setBackgroundResource(R.color.darkGray);
                focusOnView(May29);
                break;
            case "6/1":
                Jun1.setBackgroundResource(R.color.darkGray);
                focusOnView(May30);
                break;
            case "6/2":
                Jun2.setBackgroundResource(R.color.darkGray);
                focusOnView(May31);
                break;
            case "6/3":
                Jun3.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun1);
                break;
            case "6/4":
                Jun4.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun2);
                break;
            case "6/5":
                Jun5.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun3);
                break;
            case "6/6":
                Jun6.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun4);
                break;
            case "6/7":
                Jun7.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun5);
                break;
            case "6/8":
                Jun8.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun6);
                break;
            case "6/9":
                Jun9.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun7);
                break;
            case "6/10":
                Jun10.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun8);
                break;
            case "6/11":
                Jun11.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun9);
                break;
            case "6/12":
                Jun12.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun10);
                break;
            case "6/13":
                Jun13.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun11);
                break;
            case "6/14":
                Jun14.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun12);
                break;
            case "6/15":
                Jun15.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun13);
                break;
            case "6/16":
                Jun16.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun14);
                break;
            case "6/17":
                Jun17.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun15);
                break;
            case "6/18":
                Jun18.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun16);
                break;
            case "6/19":
                Jun19.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun17);
                break;
            case "6/20":
                Jun20.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun18);
                break;
            case "6/21":
                Jun21.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun19);
                break;
            case "6/22":
                Jun22.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun20);
                break;
            case "6/23":
                Jun23.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun21);
                break;
            case "6/24":
                Jun24.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun22);
                break;
            case "6/25":
                Jun25.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun23);
                break;
            case "6/26":
                Jun26.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun24);
                break;
            case "6/27":
                Jun27.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun25);
                break;
            case "6/28":
                Jun28.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun26);
                break;
            case "6/29":
                Jun29.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun27);
                break;
            case "6/30":
                Jun30.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun28);
                break;
            case "7/1":
                Jul1.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun29);
                break;
            case "7/2":
                Jul2.setBackgroundResource(R.color.darkGray);
                focusOnView(Jun30);
                break;
            case "7/3":
                Jul3.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul1);
                break;
            case "7/4":
                Jul4.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul2);
                break;
            case "7/5":
                Jul5.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul3);
                break;
            case "7/6":
                Jul6.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul4);
                break;
            case "7/7":
                Jul7.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul5);
                break;
            case "7/8":
                Jul8.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul6);
                break;
            case "7/9":
                Jul9.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul7);
                break;
            case "7/10":
                Jul10.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul8);
                break;
            case "7/11":
                Jul11.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul9);
                break;
            case "7/12":
                Jul12.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul10);
                break;
            case "7/13":
                Jul13.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul11);
                break;
            case "7/14":
                Jul14.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul12);
                break;
            case "7/15":
                Jul15.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul13);
                break;
            case "7/16":
                Jul16.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul14);
                break;
            case "7/17":
                Jul17.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul15);
                break;
            case "7/18":
                Jul18.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul16);
                break;
            case "7/19":
                Jul19.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul17);
                break;
            case "7/20":
                Jul20.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul18);
                break;
            case "7/21":
                Jul21.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul19);
                break;
            case "7/22":
                Jul22.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul20);
                break;
            case "7/23":
                Jul23.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul21);
                break;
            case "7/24":
                Jul24.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul22);
                break;
            case "7/25":
                Jul25.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul23);
                break;
            case "7/26":
                Jul26.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul24);
                break;
            case "7/27":
                Jul27.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul25);
                break;
            case "7/28":
                Jul28.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul26);
                break;
            case "7/29":
                Jul29.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul27);
                break;
            case "7/30":
                Jul30.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul28);
                break;
            case "7/31":
                Jul31.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul29);
                break;
            case "8/1":
                Aug1.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul30);
                break;
            case "8/2":
                Aug2.setBackgroundResource(R.color.darkGray);
                focusOnView(Jul31);
                break;
            case "8/3":
                Aug3.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug1);
                break;
            case "8/4":
                Aug4.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug2);
                break;
            case "8/5":
                Aug5.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug3);
                break;
            case "8/6":
                Aug6.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug4);
                break;
            case "8/7":
                Aug7.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug5);
                break;
            case "8/8":
                Aug8.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug6);
                break;
            case "8/9":
                Aug9.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug7);
                break;
            case "8/10":
                Aug10.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug8);
                break;
            case "8/11":
                Aug11.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug9);
                break;
            case "8/12":
                Aug12.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug10);
                break;
            case "8/13":
                Aug13.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug11);
                break;
            case "8/14":
                Aug14.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug12);
                break;
            case "8/15":
                Aug15.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug13);
                break;
            case "8/16":
                Aug16.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug14);
                break;
            case "8/17":
                Aug17.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug15);
                break;
            case "8/18":
                Aug18.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug16);
                break;
            case "8/19":
                Aug19.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug17);
                break;
            case "8/20":
                Aug20.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug18);
                break;
            case "8/21":
                Aug21.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug19);
                break;
            case "8/22":
                Aug22.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug20);
                break;
            case "8/23":
                Aug23.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug21);
                break;
            case "8/24":
                Aug24.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug22);
                break;
            case "8/25":
                Aug25.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug23);
                break;
            case "8/26":
                Aug26.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug24);
                break;
            case "8/27":
                Aug27.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug25);
                break;
            case "8/28":
                Aug28.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug26);
                break;
            case "8/29":
                Aug29.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug27);
                break;
            case "8/30":
                Aug30.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug28);
                break;
            case "8/31":
                Aug31.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug29);
                break;
            case "9/1":
                Sep1.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug30);
                break;
            case "9/2":
                Sep2.setBackgroundResource(R.color.darkGray);
                focusOnView(Aug31);
                break;
            case "9/3":
                Sep3.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep1);
                break;
            case "9/4":
                Sep4.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep2);
                break;
            case "9/5":
                Sep5.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep3);
                break;
            case "9/6":
                Sep6.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep4);
                break;
            case "9/7":
                Sep7.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep5);
                break;
            case "9/8":
                Sep8.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep6);
                break;
            case "9/9":
                Sep9.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep7);
                break;
            case "9/10":
                Sep10.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep8);
                break;
            case "9/11":
                Sep11.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep9);
                break;
            case "9/12":
                Sep12.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep10);
                break;
            case "9/13":
                Sep13.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep11);
                break;
            case "9/14":
                Sep14.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep12);
                break;
            case "9/15":
                Sep15.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep13);
                break;
            case "9/16":
                Sep16.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep14);
                break;
            case "9/17":
                Sep17.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep15);
                break;
            case "9/18":
                Sep18.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep16);
                break;
            case "9/19":
                Sep19.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep17);
                break;
            case "9/20":
                Sep20.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep18);
                break;
            case "9/21":
                Sep21.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep19);
                break;
            case "9/22":
                Sep22.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep20);
                break;
            case "9/23":
                Sep23.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep21);
                break;
            case "9/24":
                Sep24.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep22);
                break;
            case "9/25":
                Sep25.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep23);
                break;
            case "9/26":
                Sep26.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep24);
                break;
            case "9/27":
                Sep27.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep25);
                break;
            case "9/28":
                Sep28.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep26);
                break;
            case "9/29":
                Sep29.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep27);
                break;
            case "9/30":
                Sep30.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep28);
                break;
            case "10/1":
                Oct1.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep29);
                break;
            case "10/2":
                Oct2.setBackgroundResource(R.color.darkGray);
                focusOnView(Sep30);
                break;
            case "10/3":
                Oct3.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct1);
                break;
            case "10/4":
                Oct4.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct2);
                break;
            case "10/5":
                Oct5.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct3);
                break;
            case "10/6":
                Oct6.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct4);
                break;
            case "10/7":
                Oct7.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct5);
                break;
            case "10/8":
                Oct8.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct6);
                break;
            case "10/9":
                Oct9.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct7);
                break;
            case "10/10":
                Oct10.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct8);
                break;
            case "10/11":
                Oct11.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct9);
                break;
            case "10/12":
                Oct12.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct10);
                break;
            case "10/13":
                Oct13.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct11);
                break;
            case "10/14":
                Oct14.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct12);
                break;
            case "10/15":
                Oct15.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct13);
                break;
            case "10/16":
                Oct16.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct14);
                break;
            case "10/17":
                Oct17.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct15);
                break;
            case "10/18":
                Oct18.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct16);
                break;
            case "10/19":
                Oct19.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct17);
                break;
            case "10/20":
                Oct20.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct18);
                break;
            case "10/21":
                Oct21.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct19);
                break;
            case "10/22":
                Oct22.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct20);
                break;
            case "10/23":
                Oct23.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct21);
                break;
            case "10/24":
                Oct24.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct22);
                break;
            case "10/25":
                Oct25.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct23);
                break;
            case "10/26":
                Oct26.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct24);
                break;
            case "10/27":
                Oct27.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct25);
                break;
            case "10/28":
                Oct28.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct26);
                break;
            case "10/29":
                Oct29.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct27);
                break;
            case "10/30":
                Oct30.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct28);
                break;
            case "10/31":
                Oct31.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct29);
                break;
            case "11/1":
                Nov1.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct30);
                break;
            case "11/2":
                Nov2.setBackgroundResource(R.color.darkGray);
                focusOnView(Oct31);
                break;
            case "11/3":
                Nov3.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov1);
                break;
            case "11/4":
                Nov4.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov2);
                break;
            case "11/5":
                Nov5.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov3);
                break;
            case "11/6":
                Nov6.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov4);
                break;
            case "11/7":
                Nov7.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov5);
                break;
            case "11/8":
                Nov8.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov6);
                break;
            case "11/9":
                Nov9.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov7);
                break;
            case "11/10":
                Nov10.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov8);
                break;
            case "11/11":
                Nov11.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov9);
                break;
            case "11/12":
                Nov12.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov10);
                break;
            case "11/13":
                Nov13.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov11);
                break;
            case "11/14":
                Nov14.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov12);
                break;
            case "11/15":
                Nov15.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov13);
                break;
            case "11/16":
                Nov16.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov14);
                break;
            case "11/17":
                Nov17.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov15);
                break;
            case "11/18":
                Nov18.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov16);
                break;
            case "11/19":
                Nov19.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov17);
                break;
            case "11/20":
                Nov20.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov18);
                break;
            case "11/21":
                Nov21.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov19);
                break;
            case "11/22":
                Nov22.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov20);
                break;
            case "11/23":
                Nov23.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov21);
                break;
            case "11/24":
                Nov24.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov22);
                break;
            case "11/25":
                Nov25.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov23);
                break;
            case "11/26":
                Nov26.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov24);
                break;
            case "11/27":
                Nov27.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov25);
                break;
            case "11/28":
                Nov28.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov26);
                break;
            case "11/29":
                Nov29.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov27);
                break;
            case "11/30":
                Nov30.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov28);
                break;
            case "12/1":
                Dec1.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov29);
                break;
            case "12/2":
                Dec2.setBackgroundResource(R.color.darkGray);
                focusOnView(Nov30);
                break;
            case "12/3":
                Dec3.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec1);
                break;
            case "12/4":
                Dec4.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec2);
                break;
            case "12/5":
                Dec5.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec3);
                break;
            case "12/6":
                Dec6.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec4);
                break;
            case "12/7":
                Dec7.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec5);
                break;
            case "12/8":
                Dec8.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec6);
                break;
            case "12/9":
                Dec9.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec7);
                break;
            case "12/10":
                Dec10.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec8);
                break;
            case "12/11":
                Dec11.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec9);
                break;
            case "12/12":
                Dec12.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec10);
                break;
            case "12/13":
                Dec13.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec11);
                break;
            case "12/14":
                Dec14.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec12);
                //readDatabase();
                break;
            case "12/15":
                Dec15.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec13);
                break;
            case "12/16":
                Dec16.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec14);
                break;
            case "12/17":
                Dec17.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec15);
                break;
            case "12/18":
                Dec18.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec16);
                break;
            case "12/19":
                Dec19.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec17);
                break;
            case "12/20":
                Dec20.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec18);
                break;
            case "12/21":
                Dec21.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec19);
                break;
            case "12/22":
                Dec22.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec20);
                break;
            case "12/23":
                Dec23.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec21);
                break;
            case "12/24":
                Dec24.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec22);
                break;
            case "12/25":
                Dec25.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec23);
                break;
            case "12/26":
                Dec26.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec24);
                break;
            case "12/27":
                Dec27.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec25);
                break;
            case "12/28":
                Dec28.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec26);
                break;
            case "12/29":
                Dec29.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec27);
                break;
            case "12/30":
                Dec30.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec28);
                break;
            case "12/31":
                Dec31.setBackgroundResource(R.color.darkGray);
                focusOnView(Dec29);
                break;
            default:
                wodTest.setText("Error");
                break;
        }



    }
}
