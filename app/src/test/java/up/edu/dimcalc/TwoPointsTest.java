package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dewhitt17 on 11/9/2016.
 */
public class TwoPointsTest {

    @Test
    public void testGetPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);

    }

    @Test
    public void testSetPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);

    }

    @Test
    public void testRandomValue() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.randomValue(0);
        testPoints.randomValue(1);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertTrue(p1.x < 11);
        assertTrue(p1.y < 11);
        assertTrue(p1.x > -11);
        assertTrue(p1.y > -11);
        assertTrue(p2.x < 11);
        assertTrue(p2.y < 11);
        assertTrue(p2.x > -11);
        assertTrue(p2.y > -11);
    }

    @Test
    public void testSetOrigin() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setOrigin(0);
        testPoints.setOrigin(1);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }

    @Test
    public void testCopy() throws Exception {
        TwoPoints testPoints = new TwoPoints();

        testPoints.setPoint(0, -3, 7);
        testPoints.setPoint(1, -4, 5);

        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);

        testPoints.copy(0, 1);

        assertEquals(p1.x, p2.x);
        assertEquals(p1.y, p2.y);

    }

    @Test
    public void testDistance() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 0, 0);
        testPoints.setPoint(1, 0, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        double result;
        result = testPoints.distance();

        assertEquals(result, 5.0, 0);
    }

    @Test
    public void testSlope() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 0, 0);
        testPoints.setPoint(1, 0, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        double result;
        result = testPoints.slope();

        assertEquals(result, Double.MAX_VALUE, 0.01);
    }
}