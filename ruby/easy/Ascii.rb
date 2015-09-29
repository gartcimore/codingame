#Dans les gares et aéroports on croise souvent ce type d'écran. Vous êtes-vous demandé comment il serait possible de simuler cet affichage dans un bon vieux terminal ? Nous oui : avec l'art ASCII !

#L'art ASCII permet de représenter des formes en utilisant des caractères. Dans notre cas, ces formes sont précisément des mots. Par exemple, le mot "MANHATTAN" pourra être affiché ainsi en art ASCII :
# #  #  ### # #  #  ### ###  #  ###
### # # # # # # # #  #   #  # # # #
### ### # # ### ###  #   #  ### # #
# # # # # # # # # #  #   #  # # # #
# # # # # # # # # #  #   #  # # # #

​#Votre mission : Ecrire un programme capable d'afficher une ligne de texte en art ASCII.

#ENTRÉE :
#Ligne 1 : la largeur L d'une lettre representée en art ASCII. Toutes les lettres font la même largeur.
#Ligne 2 : la hauteur H d'une lettre représentée en art ASCII. Toutes les lettres font la même hauteur.
#Ligne 3 : La ligne de texte T, composée de N caractères ASCII
#Lignes suivantes : La chaîne de caractères ABCDEFGHIJKLMNOPQRSTUVWXYZ? représentée en art ASCII.
#
#SORTIE :
#Le texte T en art ASCII.
#Les caractères de a à z seront affichés en art ASCII par leur équivalent en majuscule.
#Les caractères qui ne sont pas dans les intervales [a-z] ou [A-Z], seront affichés par le point d'interrogation en art ASCII.
#
#CONTRAINTES :
#0 < L < 30
#0 < H < 30
#0 < N < 200
#
#EXEMPLE 1 :
#Entrée
#4
#5
#E
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
#Sortie
###
#
##
#
###

#EXEMPLE 2 :
#Entrée
#4
#5
#MANHATTAN
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
#Sortie
# # #  #  ### # #  #  ### ###  #  ###  ### # # # # # # # #  #   #  # # # #  ### ### # # ### ###  #   #  ### # #  # # # # # # # # # #  #   #  # # # #  # # # # # # # # # #  #   #  # # # #


# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

@l = gets.to_i
@h = gets.to_i
@t = gets.chomp
@ascii = [];
@h.times do
    @ascii << gets.chomp
end

# Write an action using puts
# To debug: STDERR.puts "Debug messages..."

@ascii.each { |x| STDERR.puts x }

@t.upcase!

@answer
@h.times do |i|
  @t.each_byte do |ordinal|
    STDERR.puts "ordinal is #{ordinal}"
    if (ordinal < 65 || ordinal > 90)
          ordinal = 91
    end
    pos = ordinal - 65

    @answer << @ascii[i][(pos * @l) .. ((pos * @l) + @l -1)]
  end
  @answer << "\n"
end

puts "#{answer}"
