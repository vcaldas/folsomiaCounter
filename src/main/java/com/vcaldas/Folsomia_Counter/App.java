package com.vcaldas.Folsomia_Counter;
/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 */

import net.imagej.ImageJ;

import java.io.File;

import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

/**
 * A very simple plugin to count Folsomia in images.
 *
 * @author Victor Caldas
 */
@Plugin(type = Command.class, headless = true, menuPath = "DevPlugins>Folsomia Counter")
public class App implements Command {

	
	@Parameter(label = "What is your name?")
	private String name = "J. Doe";

	@Parameter(type = ItemIO.OUTPUT)
	private String greeting;
	
	private File INPUTDIR = new File("/Users/caldas/Dropbox/Photos Folsomia");
	private File OUTPUTDIR;
	private int NFiles;

	/**
	 * Produces an output with the well-known "Hello, World!" message. The
	 * {@code run()} method of every {@link Command} is the entry point for
	 * ImageJ: this is what will be called when the user clicks the menu entry,
	 * after the inputs are populated.
	 */
	@Override
	public void run() {
		this.NFiles = INPUTDIR.list().length;
		System.out.println(NFiles);
		greeting = "Hello, " + name + "!";
	}

	private void setParameters() {
		//Call gui
		
		
	}

	/**
	 * A {@code main()} method for testing.
	 * <p>
	 * When developing a plugin in an Integrated Development Environment (such as
	 * Eclipse or NetBeans), it is most convenient to provide a simple
	 * {@code main()} method that creates an ImageJ context and calls the plugin.
	 * </p>
	 * <p>
	 * In particular, this comes in handy when one needs to debug the plugin:
	 * after setting one or more breakpoints and populating the inputs (e.g. by
	 * calling something like
	 * {@code ij.command().run(MyPlugin.class, "inputImage", myImage)} where
	 * {@code inputImage} is the name of the field specifying the input) debugging
	 * becomes a breeze.
	 * </p>
	 * 
	 * @param args unused
	 */
	public static void main(final String... args) {
		// Launch ImageJ as usual.
		final ImageJ ij = net.imagej.Main.launch(args);

		// Launch our "Hello World" command right away.
		ij.command().run(App.class, true);
	}

}
