import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
  
public class LayoutsMenu extends JFrame implements ActionListener {  
	JFrame f = new JFrame("LayoutsMenu");  
	JPanel p = new JPanel(), p2 = new JPanel();

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

	JMenuBar mb;
	JMenu menu, menu2;
	JMenuItem i1, i2, i3, i4, i5, i6, i6b, i7, /*i8, i9,*/ i10, i11;

	BorderLayout borderLayout = new BorderLayout();
	FlowLayout flowLayout = new FlowLayout();
	GridLayout gridLayout = new GridLayout(3, 3);
	CardLayout cardLayout = new CardLayout();
	GridBagLayout gridBagLayout = new GridBagLayout();
	BoxLayout boxLayoutX = new BoxLayout(p, BoxLayout.X_AXIS);
	BoxLayout boxLayoutY = new BoxLayout(p, BoxLayout.Y_AXIS);
	GroupLayout groupLayout = new GroupLayout(p);
	// ScrollPaneLayout scrollPaneLayout = new ScrollPaneLayout();
	// SpringLayout springLayout = new SpringLayout();

	LayoutsMenu() {  
	    mb = new JMenuBar();
	    menu = new JMenu("Select Layouts from this MENU");
	    menu2 = new JMenu("For CardLayout ONLY");

	    i1 = new JMenuItem("BorderLayout");			i1.addActionListener(this);			menu.add(i1);
	    i2 = new JMenuItem("FlowLayout");			i2.addActionListener(this);			menu.add(i2);
	    i3 = new JMenuItem("GridLayout");			i3.addActionListener(this);			menu.add(i3);
	    i4 = new JMenuItem("CardLayout *");			i4.addActionListener(this);			menu.add(i4);
	    i5 = new JMenuItem("GridBagLayout");		i5.addActionListener(this);			menu.add(i5);
	    i6 = new JMenuItem("BoxLayout X");			i6.addActionListener(this);			menu.add(i6);
	    i6b = new JMenuItem("BoxLayout Y");			i6b.addActionListener(this);		menu.add(i6b);
	    i7 = new JMenuItem("GroupLayout");			i7.addActionListener(this);			menu.add(i7);
	    // i8 = new JMenuItem("ScrollPaneLayout");		i8.addActionListener(this);			menu.add(i8);
	    // i9 = new JMenuItem("SpringLayout");			i8.addActionListener(this);			menu.add(i9);

	    i10 = new JMenuItem("Next Card");			i10.addActionListener(this);		menu2.add(i10);
	    i11 = new JMenuItem("Previous Card");		i11.addActionListener(this);		menu2.add(i11);

	    mb.add(menu);
	    mb.add(menu2);
	    f.setJMenuBar(mb);

	    b1 = new JButton("b1");
	    b2 = new JButton("b2");
	    b3 = new JButton("b3");
	    b4 = new JButton("b4");
	    b5 = new JButton("b5");
	    b6 = new JButton("b6");
	    b7 = new JButton("b7");
	    b8 = new JButton("b8");
	    b9 = new JButton("b9");

	    f.setPreferredSize(new Dimension(500, 500));
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	    f.pack();
	}

	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == i1) {
			removeEverything();

			p.setLayout(borderLayout);
		    p.add(b1, BorderLayout.NORTH);
		    p.add(b2, BorderLayout.SOUTH);
		    p.add(b3, BorderLayout.EAST);
		    p.add(b4, BorderLayout.WEST);
		    
			p2.setLayout(new BorderLayout());	p2.validate();
		    
		    p2.add(b5, BorderLayout.NORTH);
		    p2.add(b6, BorderLayout.SOUTH);
		    p2.add(b7, BorderLayout.EAST);
		    p2.add(b8, BorderLayout.WEST);
		    p2.add(b9, BorderLayout.CENTER);

			p.add(p2, BorderLayout.CENTER);		p.validate();
			
			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i2) {
			removeEverything();		addEverything();

			p.setLayout(flowLayout);		p.validate();
			
			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i3) {
			removeEverything();		addEverything();

			p.setLayout(gridLayout);	p.validate();
			
			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i4) {
			removeEverything();		addEverything();

			p.setLayout(cardLayout);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i10) {
			cardLayout.next(p);
		}
		else if(ae.getSource() == i11) {
			cardLayout.previous(p);
		}
		else if(ae.getSource() == i5) {
			removeEverything();		addEverything();

			p.setLayout(gridBagLayout);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i6) {
			removeEverything();		addEverything();

			p.setLayout(boxLayoutX);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i6b) {
			removeEverything();		addEverything();

			p.setLayout(boxLayoutY);		p.validate();

			f.add(p);		f.validate();
		}
		else if(ae.getSource() == i7) {
			removeEverything();		addEverything();

			groupLayout.setAutoCreateGaps(true);
			groupLayout.setAutoCreateContainerGaps(true);
			
			groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                .addComponent(b1)
                .addComponent(b2)
                .addComponent(b3)
                .addComponent(b4)
                .addComponent(b5)
                .addComponent(b6)
                .addComponent(b7)
                .addComponent(b8)
                .addComponent(b9)
                );

			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(b1)
                .addComponent(b2)
                .addComponent(b3)
                .addComponent(b4)
                .addComponent(b5)
                .addComponent(b6)
                .addComponent(b7)
                .addComponent(b8)
                .addComponent(b9)
				);

			p.setLayout(groupLayout);		p.validate();

			f.add(p);		f.validate();
		}
		/*else if(ae.getSource() == i8) {
			removeEverything();		addEverything();

			p.setLayout(scrollPaneLayout);
		}
		else if(ae.getSource() == i9) {
			removeEverything();		addEverything();

			p.setLayout(springLayout);

			springLayout.putConstraint(SpringLayout.WEST, b1, 6, SpringLayout.WEST, p);
			springLayout.putConstraint(SpringLayout.NORTH, b2, 6, SpringLayout.NORTH, p);
			springLayout.putConstraint(SpringLayout.WEST, b3, 6, SpringLayout.EAST, p);
			springLayout.putConstraint(SpringLayout.NORTH, b4, 6, SpringLayout.NORTH, p);
			springLayout.putConstraint(SpringLayout.EAST, b5, 6, SpringLayout.EAST, p);
			springLayout.putConstraint(SpringLayout.SOUTH, b6, 6, SpringLayout.SOUTH, p);
			springLayout.putConstraint(SpringLayout.WEST, b7, 6, SpringLayout.WEST, p);
			springLayout.putConstraint(SpringLayout.WEST, b8, 6, SpringLayout.WEST, p);
			springLayout.putConstraint(SpringLayout.WEST, b9, 6, SpringLayout.WEST, p);

			f.add(p);		f.validate();
		}*/
	}

	public void removeEverything() {
		p.remove(p2);
		p.remove(b1);		p2.remove(b1);
		p.remove(b2);		p2.remove(b2);
		p.remove(b3);		p2.remove(b3);
		p.remove(b4);		p2.remove(b4);
		p.remove(b5);		p2.remove(b5);
		p.remove(b6);		p2.remove(b6);
		p.remove(b7);		p2.remove(b7);
		p.remove(b8);		p2.remove(b8);
		p.remove(b9);		p2.remove(b9);
		f.remove(p);
	}

	public void addEverything() {
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		f.add(p);
	}

	public static void main(String[] args) {  
	    new LayoutsMenu();  
	}  
}   
