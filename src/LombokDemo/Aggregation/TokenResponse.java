package LombokDemo.Aggregation;

import lombok.Value;

@Value // Wszystkie pola stają się automatycznie 'private final', klasa jest final, brak setterów
public class TokenResponse {
    String accessToken;
    long expiresInSeconds;
}