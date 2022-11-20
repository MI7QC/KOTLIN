package mi7qc.dev.mi7calc

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*
@RequiresApi(Build.VERSION_CODES.N)



class MainActivity : AppCompatActivity() {

    private var tvSelectedDate : TextView? = null
    private var tvAgeInMinutes : TextView? = null
    private var tvAgeInDay : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)

        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)
        tvAgeInDay = findViewById(R.id.tvAgeInDay)



        btnDatePicker.setOnClickListener{
            clickDatePicker()
        }
    }

    private fun clickDatePicker(){


        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)


         val dpd = DatePickerDialog(this,
         DatePickerDialog.OnDateSetListener{_, selectYear, selectMonth, selectDayOfMonth ->

             Toast.makeText(this,
             "Year was $selectYear, month was ${selectMonth+1} , day of the month was $selectDayOfMonth", Toast.LENGTH_LONG).show()

             val selectedDate = "$selectDayOfMonth/${selectMonth+1}/$selectYear"

             tvSelectedDate?.text = selectedDate

             val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

             val theDate = sdf.parse(selectedDate)

                 theDate?.let {
                     val selectedDateInMinute = theDate.time / 60000
                     val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))


                     var today = Date()
                     var days : Long = (today.time - theDate.time)/86400000


                 currentDate?.let{
                     val currentDateInMinutes = currentDate.time/ 60000
                     val differenceInMinutes = currentDateInMinutes - selectedDateInMinute



                         tvAgeInMinutes?.text = differenceInMinutes.toString()
                         tvAgeInDay?.text = days.toString()



                 }

             }

         },
             year,
             month,
             day
         )
        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()
    }
}