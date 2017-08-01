package io.swagger.api;

import io.swagger.model.Survey;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-01T17:52:06.007Z")

@Api(value = "surveys", description = "the surveys API")
public interface SurveysApi {

    @ApiOperation(value = "Creates a new Survey.", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/surveys",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createSurvey(@ApiParam(value = "Survey Payload Information" ,required=true ) @RequestBody Survey body);


    @ApiOperation(value = "Delete survey by SurveyID", notes = "Delete the survey by survey Id", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Survey not found", response = Void.class) })
    @RequestMapping(value = "/surveys/{surveyId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSurvey(@ApiParam(value = "ID of the survey to be deleted.",required=true ) @PathVariable("surveyId") Long surveyId);


    @ApiOperation(value = "Search for all surveys", notes = "Returns all surveys.", response = Survey.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Survey.class),
        @ApiResponse(code = 400, message = "Surveys are not found.", response = Survey.class) })
    @RequestMapping(value = "/surveys",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Survey>> findAllSurveys(@ApiParam(value = "Page number of collection.") @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
        @ApiParam(value = "Number of elements to be returned in each page.") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Get Survey by SurveyId", notes = "", response = Survey.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Survey.class),
        @ApiResponse(code = 400, message = "Invalid Survey ID", response = Survey.class),
        @ApiResponse(code = 404, message = "Survey not found", response = Survey.class) })
    @RequestMapping(value = "/surveys/{surveyId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Survey> findSurveyById(@ApiParam(value = "Id of the survey to be searched.",required=true ) @PathVariable("surveyId") String surveyId);


    @ApiOperation(value = "Update an existing Survey", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Survey not found", response = Void.class),
        @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    @RequestMapping(value = "/surveys/{surveyId}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateSurvey(@ApiParam(value = "Survey Id.",required=true ) @PathVariable("surveyId") Integer surveyId,
        @ApiParam(value = "Survey payload that needs to be updated." ,required=true ) @RequestBody Survey body);

}
