import java.awt.*;
public class MyMenu implements ActionListener
{
	public static void main(String args[])
	{
		Frame f;
		MenuBar mb;
		f=new Frame("Menu Frame");
		mb=new MenuBar();
		f.setMenuBar(mb);
		Menu mFile,mEdit;
		mFile=new Menu("File");
		mEdit=new Menu("Edit");
		mb.add(mFile);
		mb.add(mEdit);
		MenuItem mNew,mClose,mCopy,mPaste;
		mNew=new MenuItem("New");
		mClose=new MenuItem("Close");
		mCopy=new MenuItem("Copy");
		mPaste=new MenuItem("paste");
		mFile.add(mNew);
		mFile.add(mClose);
		mFile.add(mCopy);
		mFile.add(mPaste);
		mClose.setEnabled(false);
		CheckboxMenuItem mPrint;
		mPrint=new CheckboxMenuItem("Print");
		mFile.add(mPrint);
		mFile.addSeparator();
		Menu mFont;
		mFont=new Menu("Font");
		mFile.add(mFont);
		mFont.add("Arial");
		mFont.add("Times New Roman");
		f.setSize(400,400);
		f.setVisible(true);
	}
}