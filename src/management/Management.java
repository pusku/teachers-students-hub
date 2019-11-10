package management;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Management extends JFrame {
	private JTextField text_batch;
	private JTextField text_id;
	private JTextField text_name;
	private JTextField text_dept;
	private JTextField text_teacher_dept;
	private JTextField text_teacher_name;
	private JButton button;
	private JTextField text_teacher_id;
	private JLabel lblSearch;
	private JTextField search_id;
	private JLabel label_result;
	private JTable output;
	private JTable table_1;
	private JTextField text_teacher_designation;
	

	public Stack<Students> student_data = new Stack<Students>() ;
	public Stack<Teachers> teachers_data = new Stack<Teachers>() ;
	private JLabel output_name_label;
	private JLabel lblDept;
	private JLabel lblId;
	private JLabel result_name;
	private JLabel result_id;
	private JLabel result_dept;
	private JLabel lblNewLabel;
	private JLabel result_designation;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management frame = new Management();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public void MessageBox( String str ){
		JOptionPane.showMessageDialog(null, str);
	}
	
	public void show_all(){
		label_result.setVisible(true);
		output_name_label.setVisible(true);
		result_name.setVisible(true);
		lblId.setVisible(true);
		result_id.setVisible(true);
		lblDept.setVisible(true);
		result_dept.setVisible(true);
		lblNewLabel.setVisible(true);
		result_designation.setVisible(true);
	}
	
	public void hide_all(){
		label_result.setVisible(false);
		output_name_label.setVisible(false);
		result_name.setVisible(false);
		lblId.setVisible(false);
		result_id.setVisible(false);
		lblDept.setVisible(false);
		result_dept.setVisible(false);
		lblNewLabel.setVisible(false);
		result_designation.setVisible(false);
	}
	
	public Management() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 650);
		getContentPane().setLayout(null);
		
		JLabel lblAddNewStudent = new JLabel("Add New Student");
		lblAddNewStudent.setBounds(10, 11, 121, 14);
		getContentPane().add(lblAddNewStudent);
		
		text_batch = new JTextField();
		text_batch.setText("Batch");
		text_batch.setBounds(403, 36, 86, 20);
		getContentPane().add(text_batch);
		text_batch.setColumns(10);
		
		text_id = new JTextField();
		text_id.setText("ID");
		text_id.setBounds(499, 36, 86, 20);
		getContentPane().add(text_id);
		text_id.setColumns(10);
		
		JButton btnAddStudent = new JButton("Add Student");
		
		btnAddStudent.setBounds(10, 67, 121, 23);
		getContentPane().add(btnAddStudent);
		
		text_name = new JTextField();
		text_name.setText("Student Name");
		text_name.setBounds(10, 36, 294, 20);
		getContentPane().add(text_name);
		text_name.setColumns(10);
		
		JLabel lblAddNewTeacher = new JLabel("Add New Teacher");
		lblAddNewTeacher.setBounds(10, 119, 121, 14);
		getContentPane().add(lblAddNewTeacher);
		
		text_dept = new JTextField();
		text_dept.setText("Dept");
		text_dept.setBounds(314, 36, 78, 20);
		getContentPane().add(text_dept);
		text_dept.setColumns(10);
		
		text_teacher_dept = new JTextField();
		text_teacher_dept.setText("Dept");
		text_teacher_dept.setColumns(10);
		text_teacher_dept.setBounds(499, 144, 86, 20);
		getContentPane().add(text_teacher_dept);
		
		text_teacher_name = new JTextField();
		text_teacher_name.setText("Teacher Name");
		text_teacher_name.setColumns(10);
		text_teacher_name.setBounds(10, 144, 294, 20);
		getContentPane().add(text_teacher_name);
		
		button = new JButton("Add Teacher");
		
		button.setBounds(10, 173, 121, 23);
		getContentPane().add(button);
		
		text_teacher_id = new JTextField();
		text_teacher_id.setText("ID");
		text_teacher_id.setColumns(10);
		text_teacher_id.setBounds(403, 144, 86, 20);
		getContentPane().add(text_teacher_id);
		
		lblSearch = new JLabel("Search");
		lblSearch.setBounds(10, 227, 46, 14);
		getContentPane().add(lblSearch);
		
		String[] options = { "Search for.....", "Teacher", "Student" };
		JComboBox search_for = new JComboBox(options);
		search_for.setBounds(10, 252, 294, 20);
		getContentPane().add(search_for);
		
		search_id = new JTextField();
		search_id.setText("ID");
		search_id.setBounds(314, 252, 175, 20);
		getContentPane().add(search_id);
		search_id.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.setBounds(496, 251, 89, 23);
		getContentPane().add(btnSearch);
		
		label_result = new JLabel("Result");
		label_result.setBounds(10, 289, 46, 14);
		getContentPane().add(label_result);
		
		
		text_teacher_designation = new JTextField();
		text_teacher_designation.setText("Designation");
		text_teacher_designation.setColumns(10);
		text_teacher_designation.setBounds(314, 144, 78, 20);
		getContentPane().add(text_teacher_designation);
		
		output_name_label = new JLabel("Name : ");
		output_name_label.setBounds(10, 312, 46, 14);
		output_name_label.setVisible(false);
		getContentPane().add(output_name_label);
		
		lblDept = new JLabel("Dept");
		lblDept.setBounds(10, 362, 46, 14);
		lblDept.setVisible(false);
		getContentPane().add(lblDept);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(10, 337, 46, 14);
		lblId.setVisible(false);
		getContentPane().add(lblId);
		
		result_name = new JLabel("New label");
		result_name.setBounds(126, 312, 248, 14);
		result_name.setVisible(false);
		getContentPane().add(result_name);
		
		result_id = new JLabel("New label");
		result_id.setBounds(126, 337, 248, 14);
		result_id.setVisible(false);
		getContentPane().add(result_id);
		
		result_dept = new JLabel("result_dept");
		result_dept.setBounds(126, 362, 248, 14);
		result_dept.setVisible(false);
		getContentPane().add(result_dept);
		
		lblNewLabel = new JLabel("Designation");
		lblNewLabel.setBounds(10, 387, 62, 14);
		lblNewLabel.setVisible(false);
		getContentPane().add(lblNewLabel);
		
		result_designation = new JLabel("Designation");
		result_designation.setBounds(126, 387, 193, 14);
		result_designation.setVisible(false);
		getContentPane().add(result_designation);
		
		

		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					Integer id = Integer.parseInt(text_id.getText().toString());
					Integer batch = Integer.parseInt(text_batch.getText().toString());
					String name = text_name.getText().toString();
					String dept = text_dept.getText().toString();
					Students student = new Students(id, batch, name, dept);
					student_data.push(student);
					
					MessageBox("Student Added");
					
				} catch (Exception exc ) {
					MessageBox(exc.getMessage());
				}
			}
		});
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Integer id = Integer.parseInt(text_teacher_id.getText().toString());
					String name = text_teacher_id.getText();
					String dept = text_teacher_dept.getText();
					String designation = text_teacher_designation.getText().toString();
					Teachers teacher = new Teachers( id, dept, designation, name);
					teachers_data.push(teacher);
					
					MessageBox("Teacher Added");
				} catch(Exception exc ){
					MessageBox(exc.getMessage());
				}
			}
		});
		
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int searchFor = search_for.getSelectedIndex();
				Integer selectedID = Integer.parseInt(search_id.getText().toString());
				int flag = 0;
				
				if( searchFor == 1 ){
					// teacher
					
					for( int i = 0; i < teachers_data.size(); i++  ){
						Teachers tech = teachers_data.elementAt(i);
						if( tech.getID() == selectedID ){
							result_name.setText(tech.getName());
							result_id.setText( tech.getID().toString() );
							result_dept.setText(tech.getDept());
							result_designation.setText(tech.getDesignation());
							
							show_all();
							
							flag = 1;
							break;
						}
					}
				} else if( searchFor == 2 ){
					
					for( int i = 0; i < student_data.size(); i++  ){
						
						Students tech = student_data.elementAt(i);
						
						if( tech.getID() == selectedID ){
							result_name.setText(tech.getName());
							result_id.setText( tech.getID().toString() );
							result_dept.setText(tech.getDept());
							
							show_all(); 
							
							flag = 2;
							break;
						}
					}
					
				}
				
				if( flag == 0 ){
					MessageBox("No Result");
					hide_all();
				}
					
			}
		});
		
	}
}
