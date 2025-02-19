package vcmsa.projects.progicetask1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var number1: EditText
    private lateinit var number2: EditText
    private lateinit var btnAdd: Button
    private lateinit var btnSubtract: Button
    private lateinit var btnMultiply: Button
    private lateinit var btnDivide: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        result = findViewById(R.id.result)

        // Set click listeners
        btnAdd.setOnClickListener { calculate('+') }
        btnSubtract.setOnClickListener { calculate('-') }
        btnMultiply.setOnClickListener { calculate('*') }
        btnDivide.setOnClickListener { calculate('/') }
    }

    private fun calculate(operator: Char) {
        val value1 = number1.text.toString()
        val value2 = number2.text.toString()

        if (value1.isEmpty() || value2.isEmpty()) {
            result.text = "Please enter both numbers"
            return
        }

        val num1 = value1.toDouble()
        val num2 = value2.toDouble()
        val output = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> if (num2 != 0.0) num1 / num2 else {
                result.text = "Cannot divide by zero"
                return
            }
            else -> 0.0
        }

        result.text = "Result: $output"
    }
}
