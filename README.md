# SnackBar-and-CardView
Full Material Design SnackBar and CardView

![ezgif com-resize](https://user-images.githubusercontent.com/43386555/82688203-a79d3200-9c82-11ea-8664-3a400c68cb64.gif)


1. add dependency Material design

* implementation 'com.google.android.material:material:1.1.0'

2. Change style.xml


        <style name="AppTheme" parent="Theme.MaterialComponents.Light">
            <!-- delete color . -->

        </style>
        
3. example design code xml


          <?xml version="1.0" encoding="utf-8"?>
          <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:app="http://schemas.android.com/apk/res-auto"
              xmlns:tools="http://schemas.android.com/tools"
              android:id="@+id/parentRoot"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              tools:context=".MainActivity">

              <Button
                  android:id="@+id/btnShowSnackBar"
                  android:layout_width="wrap_content"
                  android:layout_height="wrap_content"
                  android:backgroundTint="@color/orange"
                  android:text="Show SnackBar"
                  app:rippleColor="@color/design_default_color_error"
                  app:layout_constraintBottom_toBottomOf="parent"
                  app:layout_constraintLeft_toLeftOf="parent"
                  app:layout_constraintRight_toRightOf="parent"
                  app:layout_constraintTop_toTopOf="parent"
                  app:layout_constraintVertical_bias="0.13999999" />

              <com.google.android.material.card.MaterialCardView
                  android:id="@+id/cardViewMaterialDesign"
                  android:layout_width="150dp"
                  android:layout_height="200dp"
                  app:cardCornerRadius="5dp"
                  app:cardElevation="5dp"
                  app:layout_constraintBottom_toBottomOf="parent"
                  app:layout_constraintEnd_toEndOf="parent"
                  app:layout_constraintStart_toStartOf="parent"
                  app:rippleColor="@color/orange"
                  app:layout_constraintTop_toBottomOf="@+id/btnShowSnackBar">

                  <RelativeLayout
                      android:gravity="center"
                      android:layout_width="match_parent"
                      android:layout_height="match_parent">

                      <TextView
                          android:id="@+id/textViewHello"
                          android:layout_width="wrap_content"
                          android:layout_height="wrap_content"
                          android:text="Hallo World"
                          android:layout_centerHorizontal="true"
                          android:textSize="18sp"
                          android:textStyle="bold" />

                      <ImageView
                          android:layout_width="140dp"
                          android:layout_height="match_parent"
                          android:layout_below="@+id/textViewHello"
                          android:layout_centerHorizontal="true"
                          android:layout_marginTop="10dp"
                          android:src="@mipmap/ic_launcher" />
                  </RelativeLayout>

              </com.google.android.material.card.MaterialCardView>

          </androidx.constraintlayout.widget.ConstraintLayout>
          
          
4. add this code below method *onCreate*


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
                  

5. finally run emulator
