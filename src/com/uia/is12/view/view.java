/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.view;

import com.uia.is12.domain.issues;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        mantenimiento_usuarios = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        consulta_users = new javax.swing.JMenuItem();
        mantenimientos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        creaProyecto = new javax.swing.JMenuItem();
        mant_proyecto = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        tarea = new javax.swing.JMenuItem();
        mante_tareas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        issue = new javax.swing.JMenuItem();
        mant_issues = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Incio");

        consulta_users.setText("Consulta Usuarios");
        consulta_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_usersActionPerformed(evt);
            }
        });
        jMenu1.add(consulta_users);

        mantenimientos.setText("Mantenimiento Usuarios");
        mantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientosActionPerformed(evt);
            }
        });
        jMenu1.add(mantenimientos);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mantenimiento_usuarios.add(jMenu1);

        jMenu2.setText("Proyectos ");

        creaProyecto.setText("Proyecto");
        creaProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaProyectoActionPerformed(evt);
            }
        });
        jMenu2.add(creaProyecto);

        mant_proyecto.setText("Mantenimiento");
        mant_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mant_proyectoActionPerformed(evt);
            }
        });
        jMenu2.add(mant_proyecto);

        mantenimiento_usuarios.add(jMenu2);

        jMenu5.setText("Tareas");

        tarea.setText("Tareas");
        tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tareaActionPerformed(evt);
            }
        });
        jMenu5.add(tarea);

        mante_tareas.setText("Mantenimiento");
        mante_tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mante_tareasActionPerformed(evt);
            }
        });
        jMenu5.add(mante_tareas);

        mantenimiento_usuarios.add(jMenu5);

        jMenu6.setText("Issues");

        issue.setText("Issues");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        jMenu6.add(issue);

        mant_issues.setText("Mantenimiento");
        mant_issues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mant_issuesActionPerformed(evt);
            }
        });
        jMenu6.add(mant_issues);

        mantenimiento_usuarios.add(jMenu6);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        menu_salir.setText("Salir");
        menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salirActionPerformed(evt);
            }
        });
        salir.add(menu_salir);

        mantenimiento_usuarios.add(salir);

        setJMenuBar(mantenimiento_usuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        // TODO add your handling code here:

        issues issues = new issues();
       

    }//GEN-LAST:event_issueActionPerformed

    private void tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tareaActionPerformed
        // TODO add your handling code here:

        tareas tareas = new tareas();
        tareas.setVisible(true);

        this.jDesktopPane1.add(tareas);
    }//GEN-LAST:event_tareaActionPerformed

    private void creaProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaProyectoActionPerformed
        // TODO add your handling code here:

        proyectos proyectos = new proyectos();
        proyectos.setVisible(true);

        this.jDesktopPane1.add(proyectos);


    }//GEN-LAST:event_creaProyectoActionPerformed

    private void mantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientosActionPerformed
        // TODO add your handling code here:

        add_users add_users = new add_users();
        add_users.setVisible(true);

        this.jDesktopPane1.add(add_users);

    }//GEN-LAST:event_mantenimientosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menu_salirActionPerformed

    private void consulta_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_usersActionPerformed
        // TODO add your handling code here:

        mant_users m;
        try {
            m = new mant_users();
            m.setVisible(true);
            this.jDesktopPane1.add(m);
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_consulta_usersActionPerformed

    private void mant_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mant_proyectoActionPerformed
        mant_proy m;
        try {
            m = new mant_proy();
            m.setVisible(true);
            this.jDesktopPane1.add(m);
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mant_proyectoActionPerformed

    private void mant_issuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mant_issuesActionPerformed

        try {
            mant_issues m = new mant_issues();
            m.setVisible(true);
            this.jDesktopPane1.add(m);
        } catch (SQLException ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mant_issuesActionPerformed

    private void mante_tareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mante_tareasActionPerformed
      return;
    }//GEN-LAST:event_mante_tareasActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consulta_users;
    private javax.swing.JMenuItem creaProyecto;
    private javax.swing.JMenuItem issue;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mant_issues;
    private javax.swing.JMenuItem mant_proyecto;
    private javax.swing.JMenuItem mante_tareas;
    private javax.swing.JMenuBar mantenimiento_usuarios;
    private javax.swing.JMenuItem mantenimientos;
    private javax.swing.JMenuItem menu_salir;
    private javax.swing.JMenu salir;
    private javax.swing.JMenuItem tarea;
    // End of variables declaration//GEN-END:variables
}
