package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO,Long> implements TaskService {


    @Override
    public TaskDTO save(TaskDTO object) {
       return super.save(object.getId(),object);
    }

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public void update(TaskDTO object) {
        super.update(object.getId(), object);
    }


}
