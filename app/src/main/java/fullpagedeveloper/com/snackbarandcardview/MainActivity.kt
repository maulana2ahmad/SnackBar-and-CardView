package fullpagedeveloper.com.snackbarandcardview

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowSnackBar.setOnClickListener {
            val snackbar = Snackbar.make(parentRoot, "Show Snackbar", Snackbar.LENGTH_LONG)
            snackbar.setAction("Retry") {
                Toast.makeText(this, "Retry Click", Toast.LENGTH_LONG).show()
            }
            snackbar.setBackgroundTint(getColor(R.color.orange))
            snackbar.setActionTextColor(Color.BLUE)
            snackbar.setTextColor(Color.WHITE)
            snackbar.show()
        }

        cardViewMaterialDesign.setOnClickListener {
            val snackbar = Snackbar.make(parentRoot, "CardView", Snackbar.LENGTH_LONG)
            snackbar.show()
        }
    }
}
