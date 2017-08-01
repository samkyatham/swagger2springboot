package io.swagger.api;

import io.swagger.model.Survey;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-08-01T17:52:06.007Z")

@Controller
public class SurveysApiController implements SurveysApi {

    public ResponseEntity<Void> createSurvey(@ApiParam(value = "Survey Payload Information" ,required=true ) @RequestBody Survey body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteSurvey(@ApiParam(value = "ID of the survey to be deleted.",required=true ) @PathVariable("surveyId") Long surveyId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<Survey>> findAllSurveys(@ApiParam(value = "Page number of collection.") @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
        @ApiParam(value = "Number of elements to be returned in each page.") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<List<Survey>>(HttpStatus.OK);
    }

    public ResponseEntity<Survey> findSurveyById(@ApiParam(value = "Id of the survey to be searched.",required=true ) @PathVariable("surveyId") String surveyId) {
        // do some magic!
        return new ResponseEntity<Survey>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateSurvey(@ApiParam(value = "Survey Id.",required=true ) @PathVariable("surveyId") Integer surveyId,
        @ApiParam(value = "Survey payload that needs to be updated." ,required=true ) @RequestBody Survey body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
