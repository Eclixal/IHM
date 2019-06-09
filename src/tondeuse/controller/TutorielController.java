package tondeuse.controller;

import tondeuse.Tondeuse;
import tondeuse.model.Question;
import tondeuse.model.QuestionAction;
import tondeuse.view.FinView;
import tondeuse.view.MenuView;
import tondeuse.view.TutorielView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TutorielController implements ActionListener {

    private TutorielView tutorielView;

    public TutorielController(TutorielView tutorielView) {
        this.tutorielView = tutorielView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int action = tutorielView.getTondeuse().getEtape();
        QuestionAction questionAction = tutorielView.getTondeuse().getTutoriel().getActionOrQuestion(action);
        if (e.getSource() == this.tutorielView.getjTexturedWhiteButtonYes()) {
            if (questionAction instanceof Question) {
                Question question = (Question) questionAction;
                if (question.getFinDuTuto()) {
                    tutorielView.dispose();
                    new FinView(question.getFinOuInfo());
                } else {
                    if (question.getPasserA() != 0) tutorielView.getTondeuse().setEtape(question.getPasserA());
                    else tutorielView.getTondeuse().nextEtape();
                    tutorielView.reload();
                    tutorielView.repaint();
                }
            }
        } else if (e.getSource() == this.tutorielView.getjTexturedWhiteButtonNo()) {
            if (questionAction instanceof Question) {
                Question question = (Question) questionAction;
                if (!question.getFinDuTuto()) {
                    tutorielView.dispose();
                    new FinView(question.getFinOuInfo());
                } else {
                    if (question.getPasserA() != 0) tutorielView.getTondeuse().setEtape(question.getPasserA());
                    else tutorielView.getTondeuse().nextEtape();
                    tutorielView.reload();
                    tutorielView.repaint();
                }
            }
        } else if (e.getSource() == this.tutorielView.getjTexturedButtonAction()) {
            tutorielView.getTondeuse().nextEtape();
            tutorielView.reload();
            tutorielView.repaint();
        } else if (e.getSource() == this.tutorielView.getjButtonClose()) {
            tutorielView.dispose();
            new MenuView();
        }
    }
}
