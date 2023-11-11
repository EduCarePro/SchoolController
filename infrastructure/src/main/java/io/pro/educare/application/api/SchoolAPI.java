package io.pro.educare.application.api;

import io.pro.educare.application.school.model.SchoolListResponse;
import io.pro.educare.application.school.model.SchoolResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("school")
public interface SchoolAPI {

  @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  @Operation(description = "create a new school")
  @ApiResponses({
    @ApiResponse(responseCode = "201", description = "Create school"),
    @ApiResponse(responseCode = "406", description = ""),
    @ApiResponse(responseCode = "500", description = "Internal error")
  })
  SchoolResponse createSchool(@RequestBody SchoolCreateRequest schoolCreateRequest);

  @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  @Operation(description = "create a new school")
  @ApiResponses({
    @ApiResponse(responseCode = "201", description = "List school"),
    @ApiResponse(responseCode = "406", description = "No processable"),
    @ApiResponse(responseCode = "500", description = "Internal error")
  })
  SchoolResponse createSchool(@RequestBody SchoolListResponse schoolListResponse);

  @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  @Operation(description = "create a new school")
  @ApiResponses({
    @ApiResponse(responseCode = "201", description = "List school"),
    @ApiResponse(responseCode = "406", description = "No processable"),
    @ApiResponse(responseCode = "500", description = "Internal error")
  })
  SchoolResponse createSchool(@RequestBody SchoolResponse schoolListResponse);

  @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  @Operation(description = "create a new school")
  @ApiResponses({
    @ApiResponse(responseCode = "201", description = "List school"),
    @ApiResponse(responseCode = "406", description = "No processable"),
    @ApiResponse(responseCode = "500", description = "Internal error")
  })
  SchoolResponse createSchool(@RequestBody String id);

}
