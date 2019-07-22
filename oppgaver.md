#Poker 5-card draw
5 Card draw poker er et kortspill som går ut på at hver spiller trekker 5 kort. Vi skal ikke implementere et helt spill, 
men heller fokusere på å evaluere hva slags hånd en spiller har. Ess er høyest De ulike hendene, rangert fra dårligst til best er:
- Kicker, høyeste kortet på hånden
- Et par: F.eks Spar 7 og Hjerter 7
- To par: f.eks Spar 7 og Herter 7, og Kløver 10 og Ruter 10.
- 3 like: F.eks Spar 7, Hjerter 7 og Kløver 7
- Straight: F.eks Spar 7, Hjerter 8, Kløver 9, Spar 10, Hjerter Knekt
- Flush: F.eks Spar 2, Spar 5, Spar 10, Spar Knekt og Spar Ess
- Fullt hus: F.eks Hjerter knekt, Spar knekt, Ruter 10, Spar 10 og Kløver 10
- Fire like: Feks. Hjerter 10, Kløver 10, Ruter 10 og Spar 10
- Straight flush: Kombinasjon av Flush og Straight
- Royal Straight Flush: Ess, konge, dame, knekt og 10 i samme type

Her skal vi jobbe testdrevet med å implementere kode for å sjekke om en hånd har en av disse verdiene.

Oppgaver:
1) Skriv en test sjekker om en hånd er 3 like.
2) Skriv så koden slik at testen kjører grønt.
3) Skriv en test som sjekker om en hånd er Straight
4) Skriv så koden slik at testen kjører grønt.
5) Skriv en test som sjekker om en hånd er Flush.
6) Skriv så koden slik at testen kjører grønt
7) Skriv en test som sjekker om en hånd er fullt hus
8) Skriv så koden slik at testen kjører grønt
9) Skriv en test som gir en spiller en hånd med fullt hus og en annen spiller med en hånd med et par. Bruk metoden beatsPlayer()
i klassen player til å sjekke om spiller 1 slår spiller 2.
10) Implementer metoden beatsPlayer() som gjør at testen du skrev i forrige oppgave kjører grønt.
