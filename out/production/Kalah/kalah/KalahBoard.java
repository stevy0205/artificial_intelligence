����   7 � �
  �	  �	  �	  �	  �	  �
 � �
 � � � � �   �	 � �
 � � �
 � �
 � �
 � �
  �
 � �
 � � �
  �
  �
  �
  � | �
  �
  �	  � �
   �  �	  �
 . �
 . � �
 j �
 � �
 � � � �
  �
 � � �	 � �
 . � NMulden I ConstantValue    NSteine APlayer C   A BPlayer   B AStart     AKalah BStart    BKalah    SIZE    board [I 	curPlayer bonus Z finished lastPlay in Ljava/util/Scanner; 	ANSI_BLUE Ljava/lang/String; � $assertionsDisabled <init> ()V Code LineNumberTable LocalVariableTable i this Lkalah/KalahBoard; StackMapTable ([IC)V b player (Lkalah/KalahBoard;)V 
isFinished ()Z isBonus getCurPlayer ()C getLastPlay ()I changePlayer print s1 s2 s3 � equals (Ljava/lang/Object;)Z obj Ljava/lang/Object; other hashCode hash 	getAKalah 	getBKalah possibleActions ()Ljava/util/List; next 
actionList Ljava/util/List; s LocalVariableTypeTable $Ljava/util/List<Lkalah/KalahBoard;>; � 	Signature &()Ljava/util/List<Lkalah/KalahBoard;>; move (I)Z mulde n j erorbern g finish f 
readAction action e !Ljava/lang/NumberFormatException; line possibleAction <clinit> 
SourceFile KalahBoard.java kalah/KalahBoard Q R D E G H I H J 2 F 7 � � � � � � %         === Player A ===           
9      --- --- --- --- --- ---       
     | 5 | 4 | 3 | 2 | 1 | 0 |      
      --- --- --- --- --- ---       
     |%2d |%2d |%2d |%2d |%2d |%2d |      
      --- --- --- --- --- ---       
 ---                           ---  
| A |                         | B | 
 ---                           ---  
|%2d |                         |%2d | 
 ---                           ---  
      --- --- --- --- --- ---       
     |%2d |%2d |%2d |%2d |%2d |%2d |      
      --- --- --- --- --- ---       
     | 7 | 8 | 9 |10 |11 |12 |      
      --- --- --- --- --- ---       
 %         === Player B ===           
 BootstrapMethods � � � � � � � f � java/lang/Object � � � � � � � � � k � p � java/util/LinkedList � _ Q ]  � � l � � e R P H java/lang/AssertionError � � � K L � _ � � quit k l � � � � java/lang/NumberFormatException Wrong action. Try again � � � � _ java/util/Scanner K � Q � [34m java/lang/String java/util/List java/lang/System 	arraycopy *(Ljava/lang/Object;ILjava/lang/Object;II)V java/util/Arrays copyOf ([II)[I
 � � [34m makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String; out Ljava/io/PrintStream; java/io/PrintStream (Ljava/lang/String;)V java/lang/Integer valueOf (I)Ljava/lang/Integer; printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; println getClass ()Ljava/lang/Class; ([I[I)Z ([I)I add [34m spielt Mulde:  (C)Ljava/lang/String; hasNextLine nextLine ()Ljava/lang/String; exit (I)V parseInt (Ljava/lang/String;)I java/lang/Class desiredAssertionStatus Ljava/io/InputStream; (Ljava/io/InputStream;)V � � � $java/lang/invoke/StringConcatFactory � Lookup InnerClasses �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � %java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles !       1 2  3    4  5 2  3    4  6 7  3    8  9 7  3    :  ; 2  3    <  = 2  3    4  > 2  3    ?  @ 2  3    A  B 2  3    C  D E    F 7    G H    I H    J 2   
 K L    M N  3    O P H     Q R  S   �     U*� *�
� *� *� *� <� *� `O*� `O����*� O*� O*A� �    T   6    <  #  *  .  2  = # > - ? 8 = > A F B N C T D U      ! V 2    U W X   Y    �     �    Q Z  S   �     -*� *�
� *� *� *� +*� � *� �    T   "    K  #  *  .  2  L ' M , N U        - W X     - [ E    - \ 7   Q ]  S   �     D*� *�
� *� *� *� *+� +� �� 	� *+� � *+� � *+� � �    T   * 
   T  #  *  .  2  U + V 3 W ; X C Y U       D W X     D [ X   ^ _  S   /     *� �    T       a U        W X    ` _  S   /     *� �    T       j U        W X    a b  S   /     *� �    T       s U        W X    c d  S   /     *� �    T       ~ U        W X    e R  S   Y     *� A� *B� � 	*A� �    T       � 	 �  �  � U        W X   Y      f R  S  �     �
LMN*� A� +�   L� *� B� 
-�   N*� :� +� � ,� Y.� SY.� SY.� SY.� SY.� SY.� SY.� SY.� SY.� SY	.� SY
	.� SY
.� SY.� SY.� S� W� -� �    T   >    �  �  � 	 �  �  � % � , � 2 � 9 � � � � � � � � � � � U   4    � W X    � g N   � h N  	 � i N  2 � [ E  Y    �  j j j  k l  S   �     +*+� �+� �*� +� � �+� M*� ,� � �    T   "    �  �  �  �  �  �  �  � U        + W X     + m n    o X  Y      p d  S   N     <Ch*� � `<�    T       �  �  � U        W X     q 2   r d  S   2     *� .�    T       � U        W X    s d  S   2     *� .�    T       � U        W X    t u  S       T� Y� L*� � +�=*� B� =>`� ,*� .� � Y*� :� W+�  W����+�    T   6    �  �  �  �  �  �  � ) � 2 � < � C � L � R � U   4  <  v X  ! 1 V 2    T W X    L w x   A y 2  z      L w {  Y    �  |� � *�  }    ~   �  S  �     �*� .=*� O*� >� >`p>*� A� � ���*� B� � ���*� \.`O�����*� .� !*� � *� *� **� � *� �**� � *� � �*� A� � 
*� �*� B� � 
*� �*� *� �    T   v    �  �  �  �  �  �   � / � 2 � A � D � N � T  f j o w | �	 �
 � � � � � � � � � U   *    � W X     � � 2   � � 2   � � 2  Y    � '  � �  S  K     �� � *� .� �  Y� !�*� A� @� �d`=*� .� %*� \.*� .``O*� O*� O��� 	� �dd=*� .� %*� \.*� .``O*� O*� O��    T   R     ! '  )! 1" :# L$ S% Z& \( ^+ j, l- s. |/ �0 �1 �2 �4 U   *  1 - � 2  s - � 2    � W X     � � 2  Y    � 2� � 1  � _  S  �     �<=� *� .� <� 	����� 1=>� *� .`=*� O����*� \.`O�<=� *� .� <� 	����� 0=>� *� .`=*� O����*� \.`O��    T   v   A B 
C D E B H "I $J -K 6L =J CN NO PS RT [U dV fW iT oZ s[ u\ }] �^ �\ �` �a �c U   R    V 2  '  V 2  $ , y 2  U  V 2  w  V 2  u + y 2    � W X    � � H  Y   ) � � � � � � � � � �   � d  S       W� *� � "  � � #� $� @� #� %L+&� '� � (+� )=� N� +� ���*� ,� �� +� ����  , 1 4 *  T   >   k m n o (p ,t 1x 4u 5v =w @y Hz J| R~ U U   4  1  � 2  5  � �   3 � N  @  � 2    W W X   Y    �  jG *� 	� 
  � �  S   �     W*� �      Q      A      B   6� � *� .� � �� � *� .� � ��    T      �  � :� U� U       W W X     W � 2  Y     @ @   � R  S   E      � -� � � � .Y� /� 0� #�    T   
      5 Y    @  �    � �   
  � � �  �     �  � �  �