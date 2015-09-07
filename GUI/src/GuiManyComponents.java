import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GuiManyComponents implements ItemListener, ActionListener {
	public static void main(String[] args) {
		new GuiManyComponents();
	}
	
	JTextField txtField1;
	JTextArea tarMultipleLines;
	JLabel lblAngryGuy;
	JButton btn;
	JTable table = new JTable();
	JComboBox combo;
	ArrayList<Book> books = new ArrayList<Book>();

	public GuiManyComponents()
	{
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(500,800);
		frame.setTitle("Text area test");
		
		txtField1 = new JTextField(5);
		tarMultipleLines = new JTextArea(5,20);
		btn = new JButton("Click me", new ImageIcon("images\\nocheck.png"));
		btn.setPreferredSize(new Dimension(150, 100));
		btn.addActionListener(this);
		
		lblAngryGuy = new JLabel("If you point at me, bad things will happen!");
		
		lblAngryGuy.addMouseMotionListener(new MouseMotionListener() {
			//inner class
			@Override
			public void mouseMoved(MouseEvent arg0) {
				JOptionPane.showMessageDialog(lblAngryGuy, "Bad things");
				
			}
			@Override
			public void mouseDragged(MouseEvent arg0) {
			}
		});
		
		
		String course[] = {"A","B","C","D"};
		combo = new JComboBox<String>(course);
        combo.addItemListener( this );


		//test data
		books.add(new Book("1ABC", "D", "1"));
		books.add(new Book("2ABC", "F", "2"));
		books.add(new Book("3ABC", "G", "3"));
		
		updateJTable();
		

		JScrollPane scrollPane = new JScrollPane(table); //add scrollpane to table
	    
 
		frame.add(lblAngryGuy);
		frame.add(txtField1);
		frame.add(tarMultipleLines);
		frame.add(combo);
		frame.add(btn);
		frame.add(scrollPane, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}

	public void updateJTable()
	{
		DefaultTableModel model = new DefaultTableModel();
		
		model.setColumnIdentifiers(new String[] { "title", "author", "publisher" });
		model.setRowCount(books.size());
		int row = 0;
		for (Book book : books) {
			model.setValueAt(book.title, row, 0);
			model.setValueAt(book.author, row, 1);
			model.setValueAt(book.publisher, row, 2);
			row++;
		}
		table.setModel(model);
	}

	
	public void actionPerformed(ActionEvent action)
	{
		JOptionPane.showMessageDialog(null, "You clicked the button");
	}
	
	public void itemStateChanged( ItemEvent event )
	{
		if( event.getSource() == combo	&& event.getStateChange() == ItemEvent.SELECTED )
		{
			JOptionPane.showMessageDialog(null, "I changed the dropdown to :" + combo.getSelectedItem());
			System.out.println( "I changed the dropdown to: " + combo.getSelectedItem() );
		}
	}
}
