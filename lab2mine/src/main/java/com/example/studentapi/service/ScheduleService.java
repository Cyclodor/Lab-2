package com.example.studentapi.service;

import com.example.studentapi.model.Group;
import com.example.studentapi.dao.ScheduleDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    private final ScheduleDAO scheduleDAO;

    public ScheduleService(ScheduleDAO scheduleDAO) {
        this.scheduleDAO = scheduleDAO;
    }

    public List<Group> getStudentGroups() {
        return scheduleDAO.getStudentGroups();
    }
}