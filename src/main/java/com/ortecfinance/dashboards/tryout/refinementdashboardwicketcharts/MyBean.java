package com.ortecfinance.dashboards.tryout.refinementdashboardwicketcharts;

import com.googlecode.wickedcharts.highcharts.options.Axis;
import com.googlecode.wickedcharts.highcharts.options.ChartOptions;
import com.googlecode.wickedcharts.highcharts.options.HorizontalAlignment;
import com.googlecode.wickedcharts.highcharts.options.Legend;
import com.googlecode.wickedcharts.highcharts.options.LegendLayout;
import com.googlecode.wickedcharts.highcharts.options.Options;
import com.googlecode.wickedcharts.highcharts.options.SeriesType;
import com.googlecode.wickedcharts.highcharts.options.Title;
import com.googlecode.wickedcharts.highcharts.options.VerticalAlignment;
import com.googlecode.wickedcharts.highcharts.options.series.SimpleSeries;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import org.apache.log4j.Logger;

@Model
public class MyBean {

	private static final Logger LOGGER = Logger.getLogger(MyBean.class);

	Options options;

	@Inject
	HelloBean helloBean;

	String title;

	@PostConstruct
	public void init() {
		LOGGER.info("*** init ***");
		options = new Options();

		options
			.setChartOptions(new ChartOptions()
				.setType(SeriesType.LINE));

		options
			.setxAxis(new Axis()
				.setCategories(Arrays
					.asList(new String[]{"Jan", "Feb", "Mar", "Apr", "May",
						"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"})));

		options
			.setyAxis(new Axis()
				.setTitle(new Title("Temperature (C)")));

		options
			.setLegend(new Legend()
				.setLayout(LegendLayout.VERTICAL)
				.setAlign(HorizontalAlignment.RIGHT)
				.setVerticalAlign(VerticalAlignment.TOP)
				.setX(-10)
				.setY(100)
				.setBorderWidth(0));

		options
			.addSeries(new SimpleSeries()
				.setName("Tokyo")
				.setData(
					Arrays
					.asList(new Number[]{7.0, 6.9, 9.5, 14.5, 18.2, 21.5,
						25.2, 26.5, 23.3, 18.3, 13.9, 9.6})));

		options
			.addSeries(new SimpleSeries()
				.setName("New York")
				.setData(
					Arrays
					.asList(new Number[]{-0.2, 0.8, 5.7, 11.3, 17.0, 22.0,
						24.8, 24.1, 20.1, 14.1, 8.6, 2.5})));
	}

	public Options getOptions() {
		options.setTitle(new Title("My very own chart " + helloBean.getName() + "---" + title));
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		LOGGER.info("Title set to " + title);
		this.title = title;
	}

}
