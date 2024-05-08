package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseExampleView;

public class MouseExampleController implements MouseListener, MouseMotionListener {
	private MouseExampleView mouseExampleView;
	
	
	public MouseExampleController(MouseExampleView mouseExampleView) {
		super();
		this.mouseExampleView = mouseExampleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseExampleView.addclick();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseExampleView.enter();
		int x = e.getX();
		int y = e.getY();
		mouseExampleView.update(x, y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseExampleView.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		mouseExampleView.update(x, y);
	}

}
