package view;

import controller.CategoryController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Category;
import model.Task;
import util.ButtonColumnCellRederer;
import util.DeadlineColumnCellRederer;
import util.TaskTableModel;

public class MainScreen extends javax.swing.JFrame {

    CategoryController categoryController;
    TaskController taskController;
    
    DefaultListModel categoresModel;
    TaskTableModel taskModel;
    
    public MainScreen() {
        initComponents();
        
        initDataController();
        initComponetsModel();
        decorateTableTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelSubTitle = new javax.swing.JLabel();
        jPanelCategory = new javax.swing.JPanel();
        jLabelCategoryTitle = new javax.swing.JLabel();
        jLabelCategoryAdd = new javax.swing.JLabel();
        jPanelCategoryList = new javax.swing.JPanel();
        jScrollPaneCategory = new javax.swing.JScrollPane();
        jListCategories = new javax.swing.JList<>();
        jPanelTask = new javax.swing.JPanel();
        jLabelTaskTitle = new javax.swing.JLabel();
        jLabelTaskAdd = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubTitle = new javax.swing.JLabel();

        jTableTasks.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Description", "Deadline", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(java.awt.Color.white);
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(195, 235, 234));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowGrid(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 780));

        jPanelTitle.setBackground(new java.awt.Color(5, 193, 193));

        jLabelTitle.setFont(new java.awt.Font("Microsoft Tai Le", 1, 36)); // NOI18N
        jLabelTitle.setForeground(java.awt.Color.white);
        jLabelTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Vitor\\Documents\\Organizer\\simbolo principal.png")); // NOI18N
        jLabelTitle.setText("  ORGANIZER");

        jLabelSubTitle.setFont(new java.awt.Font("Microsoft Tai Le", 0, 16)); // NOI18N
        jLabelSubTitle.setForeground(java.awt.Color.white);
        jLabelSubTitle.setText("Organize from your daily appointments, your annual goals or even your sudden notes in a simple and efficient way");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCategory.setBackground(java.awt.Color.white);

        jLabelCategoryTitle.setBackground(new java.awt.Color(5, 193, 193));
        jLabelCategoryTitle.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabelCategoryTitle.setForeground(new java.awt.Color(5, 193, 193));
        jLabelCategoryTitle.setText("CATEGORY");

        jLabelCategoryAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Vitor\\Documents\\Organizer\\add.png")); // NOI18N
        jLabelCategoryAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCategoryAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCategoryTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCategoryAdd)
                .addContainerGap())
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCategoryTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCategoryAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelCategoryList.setBackground(java.awt.Color.white);

        jListCategories.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jListCategories.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListCategories.setFixedCellHeight(50);
        jListCategories.setSelectionBackground(new java.awt.Color(5, 193, 193));
        jListCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCategoriesMouseClicked(evt);
            }
        });
        jScrollPaneCategory.setViewportView(jListCategories);

        javax.swing.GroupLayout jPanelCategoryListLayout = new javax.swing.GroupLayout(jPanelCategoryList);
        jPanelCategoryList.setLayout(jPanelCategoryListLayout);
        jPanelCategoryListLayout.setHorizontalGroup(
            jPanelCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanelCategoryListLayout.setVerticalGroup(
            jPanelCategoryListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategoryListLayout.createSequentialGroup()
                .addComponent(jScrollPaneCategory)
                .addContainerGap())
        );

        jPanelTask.setBackground(java.awt.Color.white);

        jLabelTaskTitle.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabelTaskTitle.setForeground(new java.awt.Color(5, 193, 193));
        jLabelTaskTitle.setText("NEW TASK, NOTE OR APPOINTMENT");

        jLabelTaskAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Vitor\\Documents\\Organizer\\add.png")); // NOI18N
        jLabelTaskAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskAdd)
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTaskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTaskLayout.createSequentialGroup()
                        .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(java.awt.Color.white);

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jose Vitor\\Documents\\Organizer\\calendar.png")); // NOI18N

        jLabelEmptyListTitle.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(5, 193, 193));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("There are no tasks registered for now xD");

        jLabelEmptyListSubTitle.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabelEmptyListSubTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmptyListSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubTitle.setText("Click the \"+\" button to set a new task");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addComponent(jLabelEmptyListSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmptyListSubTitle)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategoryList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCategoryList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCategoryAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCategoryAddMouseClicked
        // TODO add your handling code here:
        CategoryDialogScreen categoryDialogScreen = new CategoryDialogScreen(this, rootPaneCheckingEnabled);
        categoryDialogScreen.setVisible(true);
        categoryDialogScreen.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
                loadCategorys();
            }
        });    
    }//GEN-LAST:event_jLabelCategoryAddMouseClicked

    private void jLabelTaskAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        int categoryIndex = jListCategories.getSelectedIndex();
        Category category = (Category) categoresModel.get(categoryIndex);
        taskDialogScreen.setCategory(category);
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e) {
                int categoryIndex = jListCategories.getSelectedIndex();
                Category category = (Category) categoresModel.get(categoryIndex);
                loadTasks(category.getId());
            }
        });
    }//GEN-LAST:event_jLabelTaskAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = taskModel.getTasks().get(rowIndex);
        
        switch(columnIndex){
                case 3:
                    taskController.update(task);
            break;
                case 4:
            break;  
                case 5:
                    taskController.removeById(task.getId());
                    taskModel.getTasks().remove(task);
                    int categoryIndex = jListCategories.getSelectedIndex();
                    Category category = (Category) categoresModel.get(categoryIndex);
                    loadTasks(category.getId());
            break;
    }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCategoriesMouseClicked
        // TODO add your handling code here:
        int categoryIndex = jListCategories.getSelectedIndex();
        Category category = (Category) categoresModel.get(categoryIndex);
        loadTasks(category.getId());
    }//GEN-LAST:event_jListCategoriesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCategoryAdd;
    private javax.swing.JLabel jLabelCategoryTitle;
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubTitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTaskAdd;
    private javax.swing.JLabel jLabelTaskTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JList<String> jListCategories;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JPanel jPanelCategoryList;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JScrollPane jScrollPaneCategory;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables
    
    public void decorateTableTask(){
        //Customizando o header da table de tasks
        jTableTasks.getTableHeader().setFont(new Font("Microsoft Tai Le", 
                Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(5, 193, 193));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
        
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer
        (new DeadlineColumnCellRederer());
        
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer
        (new ButtonColumnCellRederer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer
        (new ButtonColumnCellRederer("delet"));
        
        //Criando um sort autom�tico para as colunas da table
        jTableTasks.setAutoCreateRowSorter(true);
    }
    
    public void initDataController(){
        categoryController = new CategoryController();
        taskController = new TaskController();
    }
    
    public void initComponetsModel(){
        categoresModel = new DefaultListModel();
        loadCategorys();
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        
        if(!categoresModel.isEmpty()){
            jListCategories.setSelectedIndex(0);
            Category category = (Category) categoresModel.get(0);
            loadTasks(category.getId());
            
        }
    }
    
    public void loadTasks(int idCategory){
        List<Task> tasks = taskController.getAll(idCategory);
        taskModel.setTasks(tasks);
        
        showJTableTasks(!tasks.isEmpty());
    }
    
    private void showJTableTasks(boolean hasTasks) {
        if(hasTasks){
            //Existem tarefas para serem carregadas
            
            if(jPanelEmptyList.isVisible()){
                jPanelEmptyList.setVisible(false);
                jPanel5.remove(jPanelEmptyList);
            }
            jPanel5.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanel5.getWidth(), jPanel5.getHeight());
            
            //N�o existem tarefas para serem mostradas
        } else {
            if (jScrollPaneTasks.isVisible()){
                jScrollPaneTasks.setVisible(false);
                jPanel5.remove(jScrollPaneTasks);
            }
            jPanel5.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel5.getWidth(), jPanel5.getHeight());
        }
    }
    
    public void loadCategorys(){
        List<Category> categories = categoryController.getAll();
        categoresModel.clear();
        for (int i=0; i < categories.size(); i++) {
            Category category = categories.get(i);
            categoresModel.addElement(category);
        }
        jListCategories.setModel(categoresModel);
    }
}
