package ctec.android.about.henrichsen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class AboutMeActivity extends Activity
{
	private Button lifeButton, foodButton, stuffButton;
	private TextView infoField;
	private ImageView pictureStuff;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_me);

		lifeButton = (Button) findViewById(R.id.lifeButton);
		foodButton = (Button) findViewById(R.id.foodButton);
		stuffButton = (Button) findViewById(R.id.stuffButton);

		infoField = (TextView) findViewById(R.id.infoField);
		
		pictureStuff = (ImageView) findViewById(R.id.imageView1);
 
		setupListeners();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_about_me, menu);
		return true;
	}

	private void setupListeners()
	{
		lifeButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				changeImage(R.id.lifeButton);

			}
		});
		
		foodButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				changeImage(R.id.foodButton);

			}
		});
		
		stuffButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				changeImage(R.id.stuffButton);

			}
		});
	}

	private void changeImage(int currentButtonID)
	{
		if (currentButtonID == R.id.lifeButton)
		{
			infoField.setText(R.string.lifeInfo);
			pictureStuff.setImageResource(R.drawable.ic_launcher);
		}
		else if (currentButtonID == R.id.foodButton)
		{
			infoField.setText(R.string.foodInfo);
			pictureStuff.setImageResource(R.drawable.spicy_food);
		}
		else
		{
			infoField.setText(R.string.stuffInfo);
			pictureStuff.setImageResource(R.drawable.running);
		}
	}

}
