package com.company.inventory.response;

import java.util.*;
import com.company.inventory.model.*;

import lombok.Data;

@Data
public class CategoryResponse {
    
    private List<Category> category;
}
