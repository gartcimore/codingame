import sys, math

# L'objectif de votre programme est de faire en sorte que Thor rejoigne l'éclair de puissance.
#Thor évolue sur une carte de 40 cases de large et 18 cases de hauteur.
#
#Au début du programme vous recevez :
#
#    variable lightX : la position X de l'éclair que Thor doit rejoindre.
#    variable lightY : la position Y de l'éclair que Thor doit rejoindre.
#    variable initialTX : la position X initiale de Thor.
#    variable initialTY : la position Y initiale de Thor.
#
#Notez que les coordonnées (X et Y) commencent en partant du haut ! Ainsi la case la plus en haut à gauche a pour coordonnées "X=0,Y=0" et celle la plus en bas à droite a pour coordonnées "X=39,Y=17".
#
#Avant la fin du tour de jeu, vous devez indiquer en sortie la direction que Thor doit prendre parmi :
#
#    N (Nord)
#    NE (Nord-Est)
#    E (Est)
#    SE (Sud-Est)
#    S (Sud)
#    SW (Sud-Ouest)
#    W (Ouest)
#    NW (Nord-Ouest)
#
#Chaque déplacement fait bouger Thor de 1 case dans la direction choisie.
#
#Vous gagnez quand Thor arrive sur l'éclair.
#
#VOUS PERDEZ SI :
#
#    Thor sort de la carte
#
#
#
#Pour réussir votre mission, codez l'algorithme suivant :
#
#    Sauvegardez la position initialTX de Thor dans une variable thorX.
#    Sauvegardez la position initialTY de Thor dans une variable thorY.
#    A chaque tour de jeu, initialisez deux variables à vide : directionX et directionY.
#    Si thorX est supérieur à lightX, directionX prend comme valeur W sinon si thorX est inférieur à lightX, directionX prend comme valeur E.
#    Si thorY est supérieur à lightY, directionY prend comme valeur N sinon si thorY est inférieur à lightY, directionY prend comme valeur S.
#    Mettez à jour les variables thorX et thorY en fonction de la direction choisie (+1 ou -1).
#    Indiquez, avant la fin du tour, sur la sortie standard, la direction qui équivaut à la concaténation de directionY et de directionX.


# LX: the X position of the light of power
# LY: the Y position of the light of power
# TX: Thor's starting X position
# TY: Thor's starting Y position
LX, LY, TX, TY = [int(i) for i in input().split()]

# game loop
while 1:
    E = int(input()) # The level of Thor's remaining energy, representing the number of moves he can still make.

    # Write an action using print
    # To debug: print("Debug messages...", file=sys.stderr)
    direction = ""
    if LY < TY :
        direction = "N"
        TY -= 1
    elif LY > TY :
        direction = "S"
        TY +=1
    else:
        print("on correct Y", file=sys.stderr)

    if LX < TX :
        direction += "W"
        TX += 1
    elif LX > TX :
        direction += "E"
        TX -= 1
    else:
        print("on correct X", file=sys.stderr)

    print(direction) # A single line providing the move to be made: N NE E SE S SW W or NW
