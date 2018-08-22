/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package orquestador.api;

import io.swagger.annotations.*;
import orquestador.model.JsonApiBodyRequestDeleteNegocio;
import orquestador.model.JsonApiBodyRequestDeleteOferta;
import orquestador.model.JsonApiBodyRequestDeletePersona;
import orquestador.model.JsonApiBodyResponseErrors;
import orquestador.model.JsonApiBodyResponseSuccess;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-17T14:53:38.878-05:00")

@Api(value = "eliminar", description = "the eliminar API")
public interface EliminarApi {

    @ApiOperation(value = "eliminar negocio", nickname = "eliminarNegocioDelete", notes = "", response = JsonApiBodyResponseSuccess.class, tags={ "negocio", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "oferta eliminada", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 404, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/eliminar/negocio",
        method = RequestMethod.DELETE)
    ResponseEntity<?> eliminarNegocioDelete(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestDeleteNegocio body);


    @ApiOperation(value = "eliminar ofertas", nickname = "eliminarOfertaDelete", notes = "", response = JsonApiBodyResponseSuccess.class, tags={ "ofertas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "oferta eliminada", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 404, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/eliminar/oferta",
        method = RequestMethod.DELETE)
    ResponseEntity<JsonApiBodyResponseSuccess> eliminarOfertaDelete(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestDeleteOferta body);


    @ApiOperation(value = "eliminar persona", nickname = "eliminarPersonaDelete", notes = "", response = JsonApiBodyResponseSuccess.class, tags={ "persona", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "oferta eliminada", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 404, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/eliminar/persona",
        method = RequestMethod.DELETE)
    ResponseEntity<?> eliminarPersonaDelete(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestDeletePersona body);

}