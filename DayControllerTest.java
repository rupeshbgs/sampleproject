package com.example.midnightday;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;

import com.example.midnightday.controller.DayController;
import com.example.midnightday.service.MidDayNightService;

public class DayControllerTest {

    @InjectMocks
    private DayController dayController;

    @Mock
    private MidDayNightService midDayNightService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    public void testConvertToWords_Success() throws MissingServletRequestParameterException {
        String timeStr = "08:34";
        String expectedResponse = "It's eight thirty-four";

        when(midDayNightService.convertToWords(timeStr)).thenReturn(expectedResponse);

        ResponseEntity<String> response = dayController.convertToWords(timeStr);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    public void testConvertToWords_InvalidFormat() throws MissingServletRequestParameterException {
        String timeStr = "08:34:59";

        ResponseEntity<String> response = dayController.convertToWords(timeStr);

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertEquals("Invalid time format", response.getBody());
    }
}