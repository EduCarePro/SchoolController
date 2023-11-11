package io.pro.educare.application.school;

import io.pro.educare.address.AddressGateway;
import io.pro.educare.application.school.create.DefaultCreateSchool;
import io.pro.educare.school.SchoolGateway;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SchoolCreateTest {
    @InjectMocks
    DefaultCreateSchool defaultCreateSchool;
    @Mock
    SchoolGateway schoolGateway;
    @Mock
    AddressGateway addressGateway;

    @BeforeEach
    protected void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void SchoolCreatedValid_whenCallSchool_school() {
        //Arrange A A
       /* UUID uuid = UUID.randomUUID();
        final var address = new Address("road", "neighborhood", 00, "house", Country.BRA);
        final var aSchool = CreateSchoolRole.with(
                "TESTING",
                new LinkedHashSet<>(Set.of("TEST@testing.com")),
                "TEST123456",
                new LinkedHashSet<>(Set.of("99999999999")),
                "323920392092392",
                address,
                TimeZone.BR,
                ZonedDateTime.now(ZoneId.of(TimeZone.BR.getTimezone())).toInstant(),
                ZonedDateTime.now(ZoneId.of(TimeZone.BR.getTimezone())).toInstant(),
                ZonedDateTime.now(ZoneId.of(TimeZone.BR.getTimezone())).toInstant(),
                true
        );
        when(defaultCreateSchool.execute(aSchool)).thenReturn(Either.right(CreateSchoolOutput.with(uuid)));

        CreateSchoolOutput output = defaultCreateSchool.execute(aSchool).get();

        assertEquals(output.id(), uuid);
        assertNotNull(output);*/
    }

}
