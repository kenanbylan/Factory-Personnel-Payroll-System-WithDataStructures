package graphicalUserInterface;
import DataStructures.EmployeeLinkedList;
import DataStructures.InterpolationSearch;
import DataStructures.MergeSortAlgorithms;
import SQLDataBase.DbManager;
import factory.personnel.payroll.system.Employee;
import guiManager.FrameChangeSettings;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * @author AFSAR
 * This class performs the operation of displaying the information in the database with the interface.
 */
public class frmPersonViewing extends javax.swing.JFrame {
    DefaultTableModel model;
    DbManager dbManager;
    
    public frmPersonViewing() {
     
        initComponents();
        setLocationRelativeTo(null);
        
        model = (DefaultTableModel) tblEmployee.getModel();
        dbManager = new DbManager();
        try {
            EmployeeLinkedList linkedList = dbManager.selectDemo();
            Employee employee = linkedList.getHeadNode();
            while(employee != null){
                Object[] row = {employee.getId(),employee.getName(),employee.getSurname()
                        ,employee.getGender(),employee.getAge(),employee.geteMail()
                        ,employee.getDepartment(),employee.getAddress(),employee.getSalary()
                        ,employee.getGrossSalary(),employee.getTax(),employee.getHourlyWage(),employee.getWorkingHours()};
                model.addRow(row);
                employee = employee.next;
                }
        } catch (SQLException ex) {
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgLockOpen = new javax.swing.JLabel();
        lblFactoryName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblFooter2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFooter1 = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        imgAdmin = new javax.swing.JLabel();
        imgAdd = new javax.swing.JLabel();
        imgRemove = new javax.swing.JLabel();
        imgUpdate = new javax.swing.JLabel();
        imgView = new javax.swing.JLabel();
        imgNotes = new javax.swing.JLabel();
        imgSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblView = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 155));

        imgLockOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgLockOpen.png"))); // NOI18N
        imgLockOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLockOpenMouseClicked(evt);
            }
        });

        lblFactoryName.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblFactoryName.setForeground(new java.awt.Color(255, 255, 255));
        lblFactoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFactoryName.setText("                      ABC FACTORY Personnel Payroll System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFactoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLockOpen)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLockOpen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFactoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "surname", "gender", "age", "eMail", "department", "address", "salary", "grossSalary", "tax", "hourlyWage", "workingHours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        lblFooter2.setBackground(new java.awt.Color(255, 255, 255));
        lblFooter2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter2.setText("ABC Company © 2021 - 2022");
        lblFooter2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblFooter1.setBackground(new java.awt.Color(255, 255, 255));
        lblFooter1.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        lblFooter1.setForeground(new java.awt.Color(0, 0, 153));
        lblFooter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFooter1.setText("Developed by Melih Afsar");
        lblFooter1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imgHome.setBackground(new java.awt.Color(204, 204, 204));
        imgHome.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgHome.setForeground(new java.awt.Color(0, 0, 153));
        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgHome.png"))); // NOI18N
        imgHome.setText("      Home");
        imgHome.setToolTipText("");
        imgHome.setOpaque(true);
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgHomeMouseExited(evt);
            }
        });

        imgAdmin.setBackground(new java.awt.Color(204, 204, 204));
        imgAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgAdmin.setForeground(new java.awt.Color(0, 0, 153));
        imgAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgAdmin.png"))); // NOI18N
        imgAdmin.setText("      Admin");
        imgAdmin.setToolTipText("");
        imgAdmin.setOpaque(true);
        imgAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgAdminMouseExited(evt);
            }
        });

        imgAdd.setBackground(new java.awt.Color(204, 204, 204));
        imgAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgAdd.setForeground(new java.awt.Color(0, 0, 153));
        imgAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgAdd.png"))); // NOI18N
        imgAdd.setText("       Add");
        imgAdd.setOpaque(true);
        imgAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgAddMouseExited(evt);
            }
        });

        imgRemove.setBackground(new java.awt.Color(204, 204, 204));
        imgRemove.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgRemove.setForeground(new java.awt.Color(0, 0, 153));
        imgRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgRemove.png"))); // NOI18N
        imgRemove.setText("     Remove");
        imgRemove.setOpaque(true);
        imgRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRemoveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgRemoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgRemoveMouseExited(evt);
            }
        });

        imgUpdate.setBackground(new java.awt.Color(204, 204, 204));
        imgUpdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgUpdate.setForeground(new java.awt.Color(0, 0, 153));
        imgUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgUpdate.png"))); // NOI18N
        imgUpdate.setText("      Update");
        imgUpdate.setOpaque(true);
        imgUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgUpdateMouseExited(evt);
            }
        });

        imgView.setBackground(new java.awt.Color(102, 102, 255));
        imgView.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        imgView.setForeground(new java.awt.Color(255, 255, 255));
        imgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgView.png"))); // NOI18N
        imgView.setText("   View");
        imgView.setOpaque(true);
        imgView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgViewMouseClicked(evt);
            }
        });

        imgNotes.setBackground(new java.awt.Color(204, 204, 204));
        imgNotes.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        imgNotes.setForeground(new java.awt.Color(0, 0, 153));
        imgNotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgEdit.png"))); // NOI18N
        imgNotes.setText("       Notes");
        imgNotes.setOpaque(true);
        imgNotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgNotesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgNotesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgNotesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imgNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(imgHome)
                .addGap(18, 18, 18)
                .addComponent(imgNotes)
                .addGap(18, 18, 18)
                .addComponent(imgAdd)
                .addGap(18, 18, 18)
                .addComponent(imgUpdate)
                .addGap(18, 18, 18)
                .addComponent(imgView)
                .addGap(18, 18, 18)
                .addComponent(imgRemove)
                .addGap(18, 18, 18)
                .addComponent(imgAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(lblFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        imgSearch.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        imgSearch.setForeground(new java.awt.Color(0, 0, 204));
        imgSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgSearchPerson.png"))); // NOI18N
        imgSearch.setText("  Search :");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblView.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblView.setForeground(new java.awt.Color(0, 0, 153));
        lblView.setText("Personnel Information Display Screen");

        btnSort.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSort.setForeground(new java.awt.Color(0, 0, 204));
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 204));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(imgSearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(461, 461, 461))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblView)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgSearch)
                            .addComponent(searchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFooter2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchKey = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblEmployee.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        FrameChangeSettings.setVisible(this,new frmHomePage());
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgNotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseClicked
        FrameChangeSettings.setVisible(this,new frmNotesPage());
    }//GEN-LAST:event_imgNotesMouseClicked

    private void imgAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelAdd());
    }//GEN-LAST:event_imgAddMouseClicked

    private void imgUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpdateMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelUpdate());
    }//GEN-LAST:event_imgUpdateMouseClicked

    private void imgViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgViewMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonViewing());
    }//GEN-LAST:event_imgViewMouseClicked

    private void imgRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseClicked
        FrameChangeSettings.setVisible(this,new frmPersonnelRemove());
    }//GEN-LAST:event_imgRemoveMouseClicked

    private void imgAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseClicked
        FrameChangeSettings.setVisible(this,new frmAdminMenu());
    }//GEN-LAST:event_imgAdminMouseClicked

    private void imgLockOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLockOpenMouseClicked
        FrameChangeSettings.setVisible(this,new frmLogin());
    }//GEN-LAST:event_imgLockOpenMouseClicked

    private void imgHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseEntered
        imgHome.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgHomeMouseEntered

    private void imgHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseExited
        imgHome.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgHomeMouseExited

    private void imgNotesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseEntered
        imgNotes.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgNotesMouseEntered

    private void imgNotesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgNotesMouseExited
        imgNotes.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgNotesMouseExited

    private void imgAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMouseEntered
        imgAdd.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgAddMouseEntered

    private void imgAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMouseExited
        imgAdd.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgAddMouseExited

    private void imgUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpdateMouseEntered
        imgUpdate.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgUpdateMouseEntered

    private void imgUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgUpdateMouseExited
        imgUpdate.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgUpdateMouseExited

    private void imgRemoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseEntered
        imgRemove.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgRemoveMouseEntered

    private void imgRemoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRemoveMouseExited
        imgRemove.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgRemoveMouseExited

    private void imgAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseEntered
        imgAdmin.setBackground(new java.awt.Color(153, 153, 255));
    }//GEN-LAST:event_imgAdminMouseEntered

    private void imgAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAdminMouseExited
        imgAdmin.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_imgAdminMouseExited

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        dbManager = new DbManager();
        MergeSortAlgorithms merge = new MergeSortAlgorithms();
        try {
            EmployeeLinkedList linkedList = dbManager.selectDemo();
            Employee employee = linkedList.getHeadNode();
            
            // Bu kod merge sort algoritmasi ile siralanacak olan tablonun önce temizlenmesini saglar.
            int index = linkedList.getNumberOfNodes(); // linkedlist yapisindaki tum node larin sayisi alinir.
            for(int i=0;i<index;i++){
                System.out.println(i);
                model.removeRow(0); // Her node, tablodan bu kod ile silinir.
            }            
            employee = merge.mergeSort(employee);  // mergeSort ile linkedlist siralanir ve siralanmis linkedlist geri doner.
            while(employee != null){ //linkedlist yapisindaki nodelar tabloya yazilir.
                Object[] row = {employee.getId(),employee.getName(),employee.getSurname()
                        ,employee.getGender(),employee.getAge(),employee.geteMail()
                        ,employee.getDepartment(),employee.getAddress(),employee.getSalary()
                        ,employee.getGrossSalary(),employee.getTax(),employee.getHourlyWage(),employee.getWorkingHours()};
                model.addRow(row);
                employee = employee.next;
                }
        } catch (SQLException ex) {}
    }//GEN-LAST:event_btnSortActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        
            DbManager manager = new DbManager(); //managere bağlanmak için obje oluşturuldu.
            String searchVal =txtSearch.getText();
            int searchId = Integer.valueOf(searchVal); //searchId Girilen
            
            InterpolationSearch inter = new InterpolationSearch();
            
            int SelectId [] = null;
            int len = 0;
            
        try {
            
             SelectId = manager.selectId().stream().mapToInt(i -> i).toArray();
             len = SelectId.length;
             int result = inter.interpolationSearch(SelectId, 0, len-1, searchId); //dönen değer hangi indiste olduğudur.
             
             if(result == -1){
                JOptionPane.showMessageDialog(null, "Person not Found!");
            }else{
                System.out.println("found person : "+result);
                FrameChangeSettings.setVisible(this,new frmAlert(searchId));
                //buradan value değeri başka bir yere yollanacaktır.
            } 
             
        } catch (SQLException ex) {
            Logger.getLogger(frmPersonViewing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchBtnActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPersonViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersonViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersonViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersonViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersonViewing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel imgAdd;
    private javax.swing.JLabel imgAdmin;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgLockOpen;
    private javax.swing.JLabel imgNotes;
    private javax.swing.JLabel imgRemove;
    private javax.swing.JLabel imgSearch;
    private javax.swing.JLabel imgUpdate;
    private javax.swing.JLabel imgView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFactoryName;
    private javax.swing.JLabel lblFooter1;
    private javax.swing.JLabel lblFooter2;
    private javax.swing.JLabel lblView;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
